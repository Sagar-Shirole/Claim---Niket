package healspan.com.claimdetail.fetchrecords.controller;

import healspan.com.claimdetail.dao.ClaimDetail;
import healspan.com.claimdetail.dto.ClaimDetailDto;
import healspan.com.claimdetail.fetchrecords.service.FetchMstService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/healspan/v1")
public class FetchMasterController {

    @Autowired
    ModelMapper mapper;
    @Autowired
    FetchMstService fetchMstService;

    @GetMapping("getclaimrecord/{id}")
    public ResponseEntity<ClaimDetailDto> findById(@PathVariable Long id) {
        ClaimDetail claimDetailDao = fetchMstService.findById(id);
        ClaimDetailDto dto = mapper.map(claimDetailDao, ClaimDetailDto.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping("getallclaimrecord")
    public List<ClaimDetailDto> getAllRecords(){
        return fetchMstService.getAllRecords();
    }
}
