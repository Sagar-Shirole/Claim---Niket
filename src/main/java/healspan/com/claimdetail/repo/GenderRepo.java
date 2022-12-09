package healspan.com.claimdetail.repo;

import healspan.com.claimdetail.dao.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepo extends JpaRepository<Gender,Long> {
}
