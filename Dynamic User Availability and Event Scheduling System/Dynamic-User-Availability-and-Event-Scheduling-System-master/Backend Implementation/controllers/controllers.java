*AvailabilityController.java:*
java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/availability")
public class AvailabilityController {

    @Autowired
    private AvailabilityService availabilityService;

    @GetMapping("/{userId}")
    public List<Availability> getAvailability(@PathVariable String userId) {
        return availabilityService.getAvailabilityByUserId(userId);
    }

    @PostMapping
    public Availability createOrUpdateAvailability(@RequestBody Availability availability) {
        return availabilityService.createOrUpdateAvailability(availability);
    }

    @DeleteMapping("/{id}")
    public void deleteAvailability(@PathVariable String id) {
        availabilityService.deleteAvailability(id);
    }
}


*SessionController.java:*
java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/{userId}")
    public List<Session> getSessions(@PathVariable String userId) {
        return sessionService.getSessionsByUserId(userId);
    }

    @PostMapping
    public Session createOrUpdateSession(@RequestBody Session session) {
        return sessionService.createOrUpdateSession(session);
    }

    @DeleteMapping("/{id}")
    public void deleteSession(@PathVariable String id) {
        sessionService.deleteSession(id);
    }
}
