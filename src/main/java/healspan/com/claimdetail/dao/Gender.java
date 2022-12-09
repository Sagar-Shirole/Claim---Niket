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
@Table(name = "GENDER_MST")
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "GENDER")
    private String name;

    @Column(name = "DIAGNOSIS_CREATED_BY")
    private Long createdBy;

    @Column(name = "DIAGNOSIS_CREATED_DATE_TIME")
    private LocalDateTime createdDateTime;

    @OneToMany(mappedBy = "gender",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<PatientInfo> patientInfo;

    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdBy=" + createdBy +
                ", createdDateTime=" + createdDateTime +
                ", patientInfo=" + patientInfo +
                '}';
    }
}
