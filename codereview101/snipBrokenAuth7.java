public class Session {
    private static HashMap<String, String> activeSessions = new HashMap<>();
    
    public static void main(String[] args) {
        String username = "user123";
        String sessionId = UUID.randomUUID().toString();        
        activeSessions.put(sessionId, username);
        String sessionToCheck = "123456"; // Un ID de sesión incorrecto

        if (activeSessions.containsKey(sessionToCheck)) {
            System.out.println("Acceso granted.");
        } else {
            System.out.println("Acceso denied.");
        }
    }
}
