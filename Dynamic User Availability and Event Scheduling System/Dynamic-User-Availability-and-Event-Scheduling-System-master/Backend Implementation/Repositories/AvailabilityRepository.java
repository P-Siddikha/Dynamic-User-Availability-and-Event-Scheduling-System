import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface AvailabilityRepository extends MongoRepository<Availability, String> {
    List<Availability> findByUserId(String userId);
}