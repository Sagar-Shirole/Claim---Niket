package healspan.com.claimdetail.fetchrecords.service;

import healspan.com.claimdetail.dao.ClaimDetail;
import healspan.com.claimdetail.dao.MedicalInfo;
import healspan.com.claimdetail.dto.*;
import healspan.com.claimdetail.repo.ClaimDetailRepo;
import healspan.com.exception.NoClaimFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class FetchMstServiceImpl implements FetchMstService {

    @Autowired
    ClaimDetailRepo claimDetailRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ClaimDetail findById(Long id) {
        Optional<ClaimDetail> claimRepo = claimDetailRepo.findById(id);
        if (!claimRepo.isEmpty()) {
            return claimRepo.get();
        } else {
            throw new NoClaimFoundException("No Claim found for id "+id+"....!!!");
        }
    }

    @Override
    public List<ClaimDetailDto> getAllRecords() {
        List<ClaimDetail> claimDetailDaoList = claimDetailRepo.findAll();
        List<ClaimDetailDto> claimDetailDtoList = new ArrayList<>();
        if(!claimDetailDaoList.isEmpty()){
            for(ClaimDetail claimDetailDao : claimDetailDaoList){
                ClaimDetailDto claimDetailDto = new ClaimDetailDto();
                claimDetailDto.setId(claimDetailDao.getId());
                PatientInfoDto patientInfoDto = modelMapper.map(claimDetailDao.getPatientInfo(),PatientInfoDto.class);
                /*AilmentDto ailmentDto = modelMapper.map(claimDetailDao.getPatientInfo().getAilment(),AilmentDto.class);
                GenderDto genderDto = modelMapper.map(claimDetailDao.getPatientInfo().getGender(),GenderDto.class);*/
                /*patientInfoDto.setAilment(ailmentDto);
                patientInfoDto.setGender(genderDto);*/
                claimDetailDto.setPatientInfo(patientInfoDto);

                MedicalInfoDto medicalInfoDto = modelMapper.map(claimDetailDao.getMedicalInfo(),MedicalInfoDto.class);
                claimDetailDto.setMedicalInfo(medicalInfoDto);

                claimDetailDtoList.add(claimDetailDto);
            }
        }
        return claimDetailDtoList;
    }
}