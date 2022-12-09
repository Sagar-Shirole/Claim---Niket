package healspan.com.claimdetail.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "MEDICAL_INFO")
public class MedicalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "Procedure")
    private String procedure;
    @Column(name = "First_Diagnosis_Date")
    private LocalDateTime firstDiagnosisDate;
    @Column(name = "Doctor_Registration_Number")
    private Long doctorRegistrationNumber;
    @Column(name = "Doctor_Name")
    private String doctorName;
    @Column(name = "Cronic_Illness_History")
    private String cronicIllnessHistory;
    @Column(name = "Provisional_Diagnosis")
    private String provisionalDiagnosis;
    @Column(name = "Doctor_Qualification")
    private String doctorQualification;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Ailment ailment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private AccidentType accidentType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TreatmentType treatmentType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PassengerDriver passengerDriver;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private VehicleType vehicleType;

    @OneToOne(mappedBy = "medicalInfo",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private ClaimDetail claimDetail;
}