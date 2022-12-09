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
@Table(name = "DIAGNOSIS_MST")
public class Ailment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "CREATED_DATE_TIME")
    private LocalDateTime createdDateTime;

    @OneToMany(mappedBy = "ailment",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<PatientInfo> patientInfo;

    @OneToMany(mappedBy = "ailment",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<MedicalInfo> medicalInfo;

    @Override
    public String toString() {
        return "Ailment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdBy=" + createdBy +
                ", createdDateTime=" + createdDateTime +
                ", patientInfo=" + patientInfo +
                ", medicalInfo=" + medicalInfo +
                '}';
    }
}
