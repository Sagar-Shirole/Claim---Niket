package healspan.com.claimdetail.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ClaimDetailDto {

    private Long id;
    private PatientInfoDto patientInfo;
    private MedicalInfoDto medicalInfo;
}
