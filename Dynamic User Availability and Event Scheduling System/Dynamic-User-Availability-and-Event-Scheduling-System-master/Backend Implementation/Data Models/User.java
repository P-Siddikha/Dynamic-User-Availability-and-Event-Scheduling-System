import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "users")
@Data
public class User {
    @Id
    private String id;
    private String email;
    private String name;
    // Other fields, e.g., password if using authentication
}
