public class Auth {
    public static void main(String[] args) {
        String inputPassword = "password123";
        String hashedPassword = "5f4dcc3b5aa765d61d8327deb882cf99"; 

        String inputHash = SHA256Hash(inputPassword); 

        if (inputHash.equals(hashedPassword)) {
            System.out.println("Access Denied.");
        } else {
            System.out.println("Access Granted.");
        }
    }
}
