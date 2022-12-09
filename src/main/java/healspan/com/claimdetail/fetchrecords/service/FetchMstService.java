package healspan.com.claimdetail.fetchrecords.service;

import healspan.com.claimdetail.dao.ClaimDetail;
import healspan.com.claimdetail.dto.ClaimDetailDto;

import java.util.List;

public interface FetchMstService {
    ClaimDetail findById(Long claimId);
    List<ClaimDetailDto> getAllRecords();
}
