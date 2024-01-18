public class Session {
    private static HashMap<String, Session> activeSessions = new HashMap<>();
    private static final long SESSION_DURATION_SECONDS = 3600;

    public static void main(String[] args) {
        String username = "user123";
        String sessionId = generateSessionToken();
        activeSessions.put(sessionId, new Session(username, Instant.now().plusSeconds(SESSION_DURATION_SECONDS)));
        String sessionToCheck = "123456"; // Un ID de sesión incorrecto      
  
        if (activeSessions.containsKey(sessionToCheck)) {
            Session session = activeSessions.get(sessionToCheck);
            if (Instant.now().isBefore(session.getExpirationTime())) {
                System.out.println("Access granted.");
            } else {
                System.out.println("Session has expired. Access denied.");
            }
        } else {
            System.out.println("Access denied.");
        }
    }
    
    private static String generateSessionToken() {
        return UUID.randomUUID().toString();
    }
}
