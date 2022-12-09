package healspan.com.claimdetail.create.service;

import healspan.com.claimdetail.dto.*;

import java.util.List;

public interface CreateMstService {
    void createAilment(AilmentDto dto);

    void createAilmentInBulk(List<AilmentDto> dtoList);

    void createGender(GenderDto dto);

    void createGenderInBulk(List<GenderDto> dtoList);

    void createAccidentType(AccidentTypeDto dto);

    void createAccidentTypeInBulk(List<AccidentTypeDto> dtoList);

    void createTreatmentType(TreatmentTypeDto dto);

    void createTreatmentTypeInBulk(List<TreatmentTypeDto> dtoList);
    void createPassengerDriver(PassengerDriverDto dto);

    void createPassengerDriverInBulk(List<PassengerDriverDto> dtoList);

    void createVehicleType(VehicleTypeDto dto);

    void createVehicleTypeInBulk(List<VehicleTypeDto> dtoList);

    void createPatientInfo(PatientInfoDto dto);

    void createMedicalInfo(MedicalInfoDto dto);

    void createClaimDetail(ClaimDetailDto dto);
}
