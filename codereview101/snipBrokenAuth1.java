public class Auth {
    public static void main(String[] args) {
        String inputPassword = "password123";
        String storedPassword = "password123"; 

        if (inputPassword.equals(storedPassword)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
