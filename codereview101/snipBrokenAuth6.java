public class Auth {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        users.add(new User("user1", "password123"));
        users.add(new User("user2", "p@ssw0rd"));
        String inputUsername = "user1";
        String inputPassword = "password123";
        for (User user : users) {
            if (user.getUsername().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
                System.out.println("Access granted.");
                return;
            }
        }

        System.out.println("Access denied.");
    }
}
