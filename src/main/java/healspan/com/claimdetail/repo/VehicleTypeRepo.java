package healspan.com.claimdetail.repo;

import healspan.com.claimdetail.dao.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepo extends JpaRepository<VehicleType,Long> {
}
