package healspan.com.claimdetail.create.service;

import healspan.com.claimdetail.dao.*;
import healspan.com.claimdetail.dto.*;
import healspan.com.claimdetail.repo.*;
import healspan.com.exception.EmptyListException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CreateMstServiceImpl implements CreateMstService {

    @Autowired
    ModelMapper mapper;

    @Autowired
    AilmentRepo ailmentRepo;

    @Autowired
    GenderRepo genderRepo;

    @Autowired
    AccidentTypeRepo accidentTypeRepo;

    @Autowired
    TreatmentTypeRepo treatmentTypeRepo;

    @Autowired
    PatientInfoRepo patientInfoRepo;

    @Autowired
    MedicalInfoRepo medicalInfoRepo;

    @Autowired
    PassengerDriverRepo passengerDriverRepo;

    @Autowired
    VehicleTypeRepo vehicleTypeRepo;

    @Autowired
    ClaimDetailRepo claimDetailRepo;

    /** CREATE - AILMENT MST**/
    @Override
    public void createAilment(AilmentDto dto) {
        dto.setCreatedDateTime(LocalDateTime.now());
        Ailment ailmentDao = mapper.map(dto, Ailment.class);
        ailmentRepo.save(ailmentDao);
    }

    @Override
    public void createAilmentInBulk(List<AilmentDto> dtoList) {
        List<Ailment> daoList = new ArrayList<>();
       if(!dtoList.isEmpty()){
           for(AilmentDto dto : dtoList){
               dto.setCreatedDateTime(LocalDateTime.now());
               Ailment ailmentDao = mapper.map(dto, Ailment.class);
               daoList.add(ailmentDao);
           }
           if(!daoList.isEmpty())
               ailmentRepo.saveAll(daoList);
       }else{
           throw new EmptyListException("The Entity List is Empty....!!!!!");
       }
    }

    /** CREATE - GENDER MST**/
    @Override
    public void createGender(GenderDto dto) {
        dto.setCreatedDateTime(LocalDateTime.now());
        Gender genderDao = mapper.map(dto, Gender.class);
        genderRepo.save(genderDao);
    }

    @Override
    public void createGenderInBulk(List<GenderDto> dtoList) {
        List<Gender> daoList = new ArrayList<>();
        if(!dtoList.isEmpty()){
            for(GenderDto dto : dtoList){
                dto.setCreatedDateTime(LocalDateTime.now());
                Gender genderDao = mapper.map(dto, Gender.class);
                daoList.add(genderDao);
            }
            if(!daoList.isEmpty())
                genderRepo.saveAll(daoList);
        }else{
            throw new EmptyListException("The Entity List is Empty....!!!!!");
        }
    }

    /** CREATE - ACCIDENT TYPE MST**/
    @Override
    public void createAccidentType(AccidentTypeDto dto) {
        dto.setCreatedDateTime(LocalDateTime.now());
        AccidentType accidentTypeDao = mapper.map(dto, AccidentType.class);
        accidentTypeRepo.save(accidentTypeDao);
    }

    @Override
    public void createAccidentTypeInBulk(List<AccidentTypeDto> dtoList) {
        List<AccidentType> daoList = new ArrayList<>();
        if(!dtoList.isEmpty()){
            for(AccidentTypeDto dto : dtoList){
                dto.setCreatedDateTime(LocalDateTime.now());
                AccidentType accidentTypeDao = mapper.map(dto, AccidentType.class);
                daoList.add(accidentTypeDao);
            }
            if(!daoList.isEmpty())
                accidentTypeRepo.saveAll(daoList);
        }else{
            throw new EmptyListException("The Entity List is Empty....!!!!!");
        }
    }

    /** CREATE - ACCIDENT TYPE MST**/
    @Override
    public void createTreatmentType(TreatmentTypeDto dto) {
        dto.setCreatedDateTime(LocalDateTime.now());
        TreatmentType treatmentTypeDao = mapper.map(dto, TreatmentType.class);
        treatmentTypeRepo.save(treatmentTypeDao);
    }

    @Override
    public void createTreatmentTypeInBulk(List<TreatmentTypeDto> dtoList) {
        List<TreatmentType> daoList = new ArrayList<>();
        if(!dtoList.isEmpty()){
            for(TreatmentTypeDto dto : dtoList){
                dto.setCreatedDateTime(LocalDateTime.now());
                TreatmentType treatmentTypeDao = mapper.map(dto, TreatmentType.class);
                daoList.add(treatmentTypeDao);
            }
            if(!daoList.isEmpty())
                treatmentTypeRepo.saveAll(daoList);
        }else{
            throw new EmptyListException("The Entity List is Empty....!!!!!");
        }
    }

    /** CREATE - PASSENGER DRIVER MST**/
    @Override
    public void createPassengerDriver(PassengerDriverDto dto) {
        dto.setCreatedDateTime(LocalDateTime.now());
        PassengerDriver passengerDriverDao = mapper.map(dto, PassengerDriver.class);
        passengerDriverRepo.save(passengerDriverDao);
    }

    @Override
    public void createPassengerDriverInBulk(List<PassengerDriverDto> dtoList) {
        List<PassengerDriver> daoList = new ArrayList<>();
        if(!dtoList.isEmpty()){
            for(PassengerDriverDto dto : dtoList){
                dto.setCreatedDateTime(LocalDateTime.now());
                PassengerDriver passengerDriverDao = mapper.map(dto, PassengerDriver.class);
                daoList.add(passengerDriverDao);
            }
            if(!daoList.isEmpty())
                passengerDriverRepo.saveAll(daoList);
        }else{
            throw new EmptyListException("The Entity List is Empty....!!!!!");
        }
    }

    /** CREATE - VEHICLE TYPE MST**/
    @Override
    public void createVehicleType(VehicleTypeDto dto) {
        dto.setCreatedDateTime(LocalDateTime.now());
        VehicleType vehicleTypeDao = mapper.map(dto, VehicleType.class);
        vehicleTypeRepo.save(vehicleTypeDao);
    }

    @Override
    public void createVehicleTypeInBulk(List<VehicleTypeDto> dtoList) {
        List<VehicleType> daoList = new ArrayList<>();
        if(!dtoList.isEmpty()){
            for(VehicleTypeDto dto : dtoList){
                dto.setCreatedDateTime(LocalDateTime.now());
                VehicleType vehicleTypeDao = mapper.map(dto, VehicleType.class);
                daoList.add(vehicleTypeDao);
            }
            if(!daoList.isEmpty())
                vehicleTypeRepo.saveAll(daoList);
        }else{
            throw new EmptyListException("The Entity List is Empty....!!!!!");
        }
    }

    /** CREATE - PATIENT INFO **/
    @Override
    public void createPatientInfo(PatientInfoDto dto) {
        PatientInfo patientInfoDao = mapper.map(dto, PatientInfo.class);
        Optional<Gender> optionalGender = genderRepo.findById(dto.getGenderId());
        Optional<Ailment> optionalAilment = ailmentRepo.findById(dto.getAilmentId());
        if (optionalGender.isPresent())
            patientInfoDao.setGender(optionalGender.get());
        if (optionalAilment.isPresent())
            patientInfoDao.setAilment(optionalAilment.get());
        patientInfoRepo.save(patientInfoDao);
    }


    /** CREATE - MEDICAL INFO **/
    @Override
    public void createMedicalInfo(MedicalInfoDto dto) {
        MedicalInfo medicalInfoDao = new MedicalInfo();
        Optional<Ailment> optionalAilment = ailmentRepo.findById(dto.getAilmentId());
        Optional<AccidentType> optionalAccidentType = accidentTypeRepo.findById(dto.getAccidentTypeId());
        Optional<TreatmentType> optionalTreatmentType = treatmentTypeRepo.findById(dto.getTreatmentTypeId());
        Optional<PassengerDriver> optionalPassengerDriver = passengerDriverRepo.findById(dto.getPassengerDriverId());
        Optional<VehicleType> optionalVehicleType = vehicleTypeRepo.findById(dto.getVehicleTypeId());
        if(optionalAilment.isPresent())
            medicalInfoDao.setAilment(optionalAilment.get());
        if(optionalAccidentType.isPresent())
            medicalInfoDao.setAccidentType(optionalAccidentType.get());
        if(optionalTreatmentType.isPresent())
            medicalInfoDao.setTreatmentType(optionalTreatmentType.get());
        if(optionalPassengerDriver.isPresent())
            medicalInfoDao.setPassengerDriver(optionalPassengerDriver.get());
        if(optionalVehicleType.isPresent())
            medicalInfoDao.setVehicleType(optionalVehicleType.get());
        medicalInfoRepo.save(medicalInfoDao);
    }

    /** CREATE - CLAIM DETAIL **/
    @Override
    public void createClaimDetail(ClaimDetailDto dto) {
        PatientInfo patientInfo = savePatientInfo(dto);
        MedicalInfo medicalInfo = saveMedicalInfo(dto);
        ClaimDetail claimDetail = new ClaimDetail();
        claimDetail.setPatientInfo(patientInfo);
        claimDetail.setMedicalInfo(medicalInfo);
        claimDetailRepo.save(claimDetail);
    }

    public PatientInfo savePatientInfo(ClaimDetailDto dto){
        PatientInfo patientInfoDao = mapper.map(dto.getPatientInfo(), PatientInfo.class);
        Optional<Gender> optionalGender = genderRepo.findById(dto.getPatientInfo().getGenderId());
        Optional<Ailment> optionalAilment = ailmentRepo.findById(dto.getPatientInfo().getAilmentId());
        if (optionalGender.isPresent())
            patientInfoDao.setGender(optionalGender.get());
        if (optionalAilment.isPresent())
            patientInfoDao.setAilment(optionalAilment.get());
        patientInfoRepo.save(patientInfoDao);
        return patientInfoDao;
    }

    public MedicalInfo saveMedicalInfo(ClaimDetailDto dto){
        MedicalInfo medicalInfoDao = new MedicalInfo();
        Optional<Ailment> optionalAilment = ailmentRepo.findById(dto.getMedicalInfo().getAilmentId());
        Optional<AccidentType> optionalAccidentType = accidentTypeRepo.findById(dto.getMedicalInfo().getAccidentTypeId());
        Optional<TreatmentType> optionalTreatmentType = treatmentTypeRepo.findById(dto.getMedicalInfo().getTreatmentTypeId());
        Optional<PassengerDriver> optionalPassengerDriver = passengerDriverRepo.findById(dto.getMedicalInfo().getPassengerDriverId());
        Optional<VehicleType> optionalVehicleType = vehicleTypeRepo.findById(dto.getMedicalInfo().getVehicleTypeId());
        if(optionalAilment.isPresent())
            medicalInfoDao.setAilment(optionalAilment.get());
        if(optionalAccidentType.isPresent())
            medicalInfoDao.setAccidentType(optionalAccidentType.get());
        if(optionalTreatmentType.isPresent())
            medicalInfoDao.setTreatmentType(optionalTreatmentType.get());
        if(optionalPassengerDriver.isPresent())
            medicalInfoDao.setPassengerDriver(optionalPassengerDriver.get());
        if(optionalVehicleType.isPresent())
            medicalInfoDao.setVehicleType(optionalVehicleType.get());
        medicalInfoRepo.save(medicalInfoDao);
        return medicalInfoDao;
    }
}
