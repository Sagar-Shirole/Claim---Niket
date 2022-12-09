package healspan.com.claimdetail.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Insurance_Company_Master")
public class InsuranceCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Approved_Amount")
    private double approvedAmount;
    @Column(name = "Enhancements_Amount")
    private double enhancementsAmount;
    @Column(name = "Company_Name")
    private String companyName;
    @Column(name = "Is_Group_Policy")
    private double initialApprovalAmount;
    @Column(name = "Policy_Holder_Name")
    private String policyHolderName;
    @Column(name = "Policy_Number")
    private Long policyNumber;
    @Column(name = "Insurance_Company_Name")
    private String insuranceCompanyName;
    @Column(name = "Relation_With_Policy_Holder")
    private String relation;
    @Column(name = "Tpa_Number")
    private Long TpaNumber;
    @OneToMany(mappedBy = "insuranceCompany",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Tpa> tpa;
    @OneToMany(mappedBy = "insuranceCompany",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<ClaimDetail> claimDetail;
}
