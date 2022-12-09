package healspan.com.claimdetail.repo;

import healspan.com.claimdetail.dao.AccidentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccidentTypeRepo extends JpaRepository<AccidentType,Long> {
}
