package healspan.com.claimdetail.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter@NoArgsConstructor
@Entity
@Table(name = "OTHER_COST_MASTER")
public class OtherCost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ocm_id", unique = true)
    private Long id;
    @Column(name = "ocm_cost_type")
    private String costType;
    @Column(name = "ocm_created_by")
    private  Long createdBy;
    @Column (name = "ocm_created_datetime")
    private LocalDateTime createdDateTime;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private PatientInfo patientInfo;
}
