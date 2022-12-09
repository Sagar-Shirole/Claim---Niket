package healspan.com.claimdetail.repo;

import healspan.com.claimdetail.dao.PatientInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInfoRepo extends JpaRepository<PatientInfo,Long> {
}
