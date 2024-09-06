import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "sessions")
@Data
public class Session {
    @Id
    private String id;
    private String userId;
    private LocalDateTime start;
    private LocalDateTime end;
    private List<String> attendees; // List of user IDs
}