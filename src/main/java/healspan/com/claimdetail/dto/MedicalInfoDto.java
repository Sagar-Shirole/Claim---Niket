package healspan.com.claimdetail.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
public class MedicalInfoDto {

    private Long id;
    private String procedure;
    private LocalDateTime firstDiagnosisDate;
    private Long doctorRegistrationNumber;
    private String doctorName;
    private String cronicIllnessHistory;
    private String provisionalDiagnosis;
    private String doctorQualification;
    private Long ailmentId;
    private AilmentDto ailment;
    private Long accidentTypeId;
    private AccidentTypeDto accidentType;
    private Long treatmentTypeId;
    private TreatmentTypeDto treatmentType;
    private Long passengerDriverId;
    private PassengerDriverDto passengerDriver;
    private Long vehicleTypeId;
    private VehicleTypeDto vehicleType;
}
