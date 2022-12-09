package healspan.com.claimdetail.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TREATMENT_TYPE_MST")
public class TreatmentType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @Column(name = "DOCTOR_QUALIFICATION")
    private String doctorQualification;

    @Column(name = "CREATED_BY_ID")
    private Long createdById;

    @Column(name = "CREATED_DATE_TIME")
    private LocalDateTime createdDateTime;

    @OneToMany(mappedBy = "treatmentType",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<MedicalInfo> medicalInfo;
}
