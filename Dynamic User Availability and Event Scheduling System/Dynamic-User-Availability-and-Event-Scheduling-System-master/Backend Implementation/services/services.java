*AvailabilityService.java:*
java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AvailabilityService {

    @Autowired
    private AvailabilityRepository availabilityRepository;

    public List<Availability> getAvailabilityByUserId(String userId) {
        return availabilityRepository.findByUserId(userId);
    }

    public Availability createOrUpdateAvailability(Availability availability) {
        return availabilityRepository.save(availability);
    }

    public void deleteAvailability(String availabilityId) {
        availabilityRepository.deleteById(availabilityId);
    }
}


*SessionService.java:*
java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public List<Session> getSessionsByUserId(String userId) {
        return sessionRepository.findByUserId(userId);
    }

    public Session createOrUpdateSession(Session session) {
        // Check for conflicts, etc.
        return sessionRepository.save(session);
    }

    public void deleteSession(String sessionId) {
        sessionRepository.deleteById(sessionId);
    }
}

