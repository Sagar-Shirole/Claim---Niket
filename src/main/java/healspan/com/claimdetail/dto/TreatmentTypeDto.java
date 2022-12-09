package healspan.com.claimdetail.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class TreatmentTypeDto {

    private Long id;

    private String type;

    private String doctorName;

    private String doctorQualification;

    private Long createdById;

    private LocalDateTime createdDateTime;
}
