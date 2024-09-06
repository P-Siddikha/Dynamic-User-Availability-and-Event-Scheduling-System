import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.time.LocalDateTime;

@Document(collection = "availabilities")
@Data
public class Availability {
    @Id
    private String id;
    private String userId;
    private LocalDateTime start;
    private LocalDateTime end;
    private int duration; // Duration in minutes
}
