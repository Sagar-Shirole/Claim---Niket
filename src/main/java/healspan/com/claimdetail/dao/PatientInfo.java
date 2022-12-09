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
@Table(name = "PATIENT_INFO")
public class PatientInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "AGE")
    private String age;
    @Column(name = "STAGE")
    private String stage;
    @Column(name = "DATE_OF_BIRTH")
    private LocalDateTime dateOfBirth;
    @Column(name = "DATE_OF_ADMISSION")
    private LocalDateTime dateOfAdmission;
    @Column(name = "DATE_OF_DISCHARGE")
    private LocalDateTime dateOfDischarge;
    @Column(name = "TOTAL_BILL_AMOUNT")
    private double totalBillAmount;
    @Column(name = "CLAIM_AMOUNT")
    private double claimAmount;
    @Column(name = "BILL_NUMBER")
    private Long billNumber;
    @Column(name = "COST_PER_DAY")
    private double costPerDay;
    @Column(name = "ENHANCEMENT_ESTIMATE")
    private double enhancementEstimate;
    @Column(name = "INITIAL_COST_ESTIMATE")
    private double initialCostEstimate;
    @Column(name = "HOSPITAL_UHID")
    private String hospitalUhid;
    @Column(name = "MOBILE_NUMBER")
    private Long mobileNumber;
    @Column(name = "PROCEDURE")
    private String procedure;
    @Column(name = "ROOM_CATEGORY")
    private String roomCategory;
    @Column(name = "TOTAL_ROOM_COST")
    private double totalRoomCost;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Ailment ailment;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Gender gender;

    @OneToOne(mappedBy = "patientInfo",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private ClaimDetail claimDetail;

    @OneToOne(mappedBy = "patientInfo",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private OtherCost otherCostEstimate;
}
