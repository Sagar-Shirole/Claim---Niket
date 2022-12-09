package healspan.com.claimdetail.repo;

import healspan.com.claimdetail.dao.ClaimDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimDetailRepo extends JpaRepository<ClaimDetail,Long> {
}
