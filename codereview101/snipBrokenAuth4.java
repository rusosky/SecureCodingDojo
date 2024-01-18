import java.util.HashMap;
import java.security.SecureRandom;
import java.util.Base64;

public class Session {
    private HashMap<String, String> sessions = new HashMap();

    public void createSession(String username) {
        String sessionToken = generateRandomSessionToken();
        sessions.put(sessionToken, username);
    }

    public String getSessionUser(String sessionToken) {
        return sessions.get(sessionToken);
    }

    public boolean isSessionValid(String sessionToken) {
        return sessions.containsKey(sessionToken);
    }

    private String generateRandomSessionToken() {
        SecureRandom random = new SecureRandom();
        byte[] sessionTokenBytes = new byte[32];
        random.nextBytes(sessionTokenBytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(sessionTokenBytes);
    }
}
