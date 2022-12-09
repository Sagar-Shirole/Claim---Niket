package healspan.com.claimdetail.dto;

import healspan.com.claimdetail.dao.OtherCost;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PatientInfoDto {
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String age;
    private String stage;
    private LocalDateTime dateOfBirth;
    private LocalDateTime dateOfAdmission;
    private LocalDateTime dateOfDischarge;
    private double totalBillAmount;
    private double claimAmount;
    private Long billNumber;
    private double costPerDay;
    private double enhancementEstimate;
    private double initialCostEstimate;
    private String hospitalUhid;
    private Long mobileNumber;
    private String procedure;
    private String roomCategory;
    private double totalRoomCost;
    private Long ailmentId;
    private AilmentDto ailment;
    private Long genderId;
    private GenderDto gender;
    private OtherCost otherCostEstimate;
}
