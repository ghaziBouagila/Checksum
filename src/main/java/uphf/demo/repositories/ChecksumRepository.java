package uphf.demo.repositories;
import uphf.demo.entities.Model_checksum;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ChecksumRepository extends JpaRepository<Model_checksum, Long> {

}
