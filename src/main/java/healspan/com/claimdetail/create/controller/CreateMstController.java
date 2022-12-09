package healspan.com.claimdetail.create.controller;

import healspan.com.claimdetail.dto.*;
import healspan.com.claimdetail.create.service.CreateMstService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/healspan/v1")
public class CreateMstController {

    Logger logger = LoggerFactory.getLogger(CreateMstController.class);

    @Autowired
    CreateMstService createMstService;

    @PostMapping("/createailment")
    public ResponseEntity<String> createAilmentRecord(@RequestBody AilmentDto dto){
        createMstService.createAilment(dto);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createbulkailment")
    public ResponseEntity<String> createAilmentRecordInBulk(@RequestBody List<AilmentDto> dtoList){
        createMstService.createAilmentInBulk(dtoList);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/creategender")
    public ResponseEntity<String> createGenderRecord(@RequestBody GenderDto dto){
        createMstService.createGender(dto);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createbulkgender")
    public ResponseEntity<String> createGenderRecordInBulk(@RequestBody List<GenderDto> dtoList){
        createMstService.createGenderInBulk(dtoList);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createaccidenttype")
    public ResponseEntity<String> createAccidentType(@RequestBody AccidentTypeDto dto){
        createMstService.createAccidentType(dto);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createbulkaccidenttype")
    public ResponseEntity<String> createAccidentTypeRecordInBulk(@RequestBody List<AccidentTypeDto> dtoList){
        createMstService.createAccidentTypeInBulk(dtoList);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createtreatmenttype")
    public ResponseEntity<String> createTreatmentType(@RequestBody TreatmentTypeDto dto){
        createMstService.createTreatmentType(dto);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createbulktreatmenttype")
    public ResponseEntity<String> createTreatmentTypeRecordInBulk(@RequestBody List<TreatmentTypeDto> dtoList){
        createMstService.createTreatmentTypeInBulk(dtoList);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createpassengerdriver")
    public ResponseEntity<String> createPassengerDriver(@RequestBody PassengerDriverDto dto){
        createMstService.createPassengerDriver(dto);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createbulkpassengerdriver")
    public ResponseEntity<String> createPassengerDriverRecordInBulk(@RequestBody List<PassengerDriverDto> dtoList){
        createMstService.createPassengerDriverInBulk(dtoList);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createvehicletype")
    public ResponseEntity<String> createVehicleType(@RequestBody VehicleTypeDto dto){
        createMstService.createVehicleType(dto);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createbulkvehicletype")
    public ResponseEntity<String> createVehicleTypeRecordInBulk(@RequestBody List<VehicleTypeDto> dtoList){
        createMstService.createVehicleTypeInBulk(dtoList);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createpatientinfo")
    public ResponseEntity<String> createPatientInfo(@RequestBody PatientInfoDto dto){
        createMstService.createPatientInfo(dto);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createmedicalinfo")
    public ResponseEntity<String> createMedicalInfo(@RequestBody MedicalInfoDto dto){
        createMstService.createMedicalInfo(dto);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/createclaiminfo")
    public ResponseEntity<String> createClaim(@RequestBody ClaimDetailDto dto){
        createMstService.createClaimDetail(dto);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }
}
