package healspan.com.claimdetail.dto;

import healspan.com.claimdetail.dao.PatientInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class OtherCostDto {
    private Long id;
    private String costType;
    private  Long createdBy;
    private LocalDateTime createdDateTime;
    private PatientInfo patientInfo;
}
