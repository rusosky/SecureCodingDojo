import java.util.HashMap;

public class Session {
    private HashMap<String, String> sessions = new HashMap<>();

    public void createSession(String username) {
        String sessionToken = generateSessionToken(username);
        sessions.put(sessionToken, username);
    }

    public String getSessionUser(String sessionToken) {
        return sessions.get(sessionToken);
    }

    public boolean isSessionValid(String sessionToken) {
        return sessions.containsKey(sessionToken);
    }

    private String generateSessionToken(String username) {
        return username + "_session";
    }
}
