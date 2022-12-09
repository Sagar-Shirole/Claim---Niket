package healspan.com.claimdetail.repo;

import healspan.com.claimdetail.dao.Ailment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AilmentRepo extends JpaRepository<Ailment,Long> {
}
