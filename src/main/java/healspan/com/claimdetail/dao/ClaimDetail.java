package healspan.com.claimdetail.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "CLAIM_DETAIL")
public class ClaimDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private PatientInfo patientInfo;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private MedicalInfo medicalInfo;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private InsuranceCompany insuranceCompany;

}
