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
@Table(name = "PASSENGER_DRIVER_MST")
public class PassengerDriver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Type")
    private String name;

    @Column(name = "CREATED_BY_ID")
    private Long createdById;

    @Column(name = "CREATED_DATE_TIME")
    private LocalDateTime createdDateTime;

    @OneToMany(mappedBy = "passengerDriver",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<MedicalInfo> medicalInfo;
}