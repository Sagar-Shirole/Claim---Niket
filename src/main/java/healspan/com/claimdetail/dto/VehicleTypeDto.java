package healspan.com.claimdetail.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class VehicleTypeDto {

    private Long id;
    private String name;
    private Long createdById;
    private LocalDateTime createdDateTime;
}
