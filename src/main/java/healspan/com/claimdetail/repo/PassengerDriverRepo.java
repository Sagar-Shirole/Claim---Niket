package healspan.com.claimdetail.repo;

import healspan.com.claimdetail.dao.PassengerDriver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerDriverRepo extends JpaRepository<PassengerDriver, Long> {
}
