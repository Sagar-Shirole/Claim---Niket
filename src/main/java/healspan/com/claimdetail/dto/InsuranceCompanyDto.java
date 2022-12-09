package healspan.com.claimdetail.dto;

import healspan.com.claimdetail.dao.ClaimDetail;
import healspan.com.claimdetail.dao.Tpa;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InsuranceCompanyDto {
    private Long id;
    private double approvedAmount;
    private double enhancementsAmount;
    private String companyName;
    private double initialApprovalAmount;
    private String policyHolderName;
    private Long policyNumber;
    private String insuranceCompanyName;
    private String relation;
    private Long TpaNumber;
    private Long tpaId;
    private Long claimDetailId;
}
