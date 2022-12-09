package healspan.com.claimdetail.dao;

import javax.persistence.*;

@Entity
@Table(name = "TPA_MST")
public class Tpa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long Id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private InsuranceCompany insuranceCompany;
}