package healspan.com.claimdetail.repo;

import healspan.com.claimdetail.dao.TreatmentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentTypeRepo extends JpaRepository<TreatmentType,Long> {
}
