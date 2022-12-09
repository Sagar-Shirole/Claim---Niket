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
@Table(name = "ACCIDENT_TYPE_MST")
public class AccidentType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CREATED_DATE_TIME")
    private LocalDateTime createdDateTime;

    @OneToMany(mappedBy = "accidentType",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<MedicalInfo> medicalInfo;
}