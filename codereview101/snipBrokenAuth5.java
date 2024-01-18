public class Auth {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        users.add(new User("user1", "$2a$10$J1d7N6fKHZAFjUb.cK.4vu33IDxMwUUt3MNQIrvRwBeom9HYz97du"));
        users.add(new User("user2", "$2a$10$Ov7E8tL0k5gNSYK3h5.ZhOAGF0/7eeg1aTJffn3HFH01oV6vnzJg."));
        String inputUsername = "user1";
        String inputPassword = "password123";
        for (User user : users) {
            if (user.getUsername().equals(inputUsername) && BCrypt.checkpw(inputPassword, user.getPassword())) {
                System.out.println("Access granted.");
                return;
            }
        }

        System.out.println("Acceso denied.");
    }
}
