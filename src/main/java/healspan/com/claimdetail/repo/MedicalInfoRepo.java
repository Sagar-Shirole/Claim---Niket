package healspan.com.claimdetail.repo;

import healspan.com.claimdetail.dao.MedicalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalInfoRepo extends JpaRepository<MedicalInfo,Long> {
}
