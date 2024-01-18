public class SQLConnection {
    public static void main(String[] args) {
        String userInput = "'; DROP TABLE users; --";
        
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
            
            ResultSet result = statement.executeQuery(query);
            
            while (result.next()) {
                System.out.println("User: " + result.getString("username"));
            }
            
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
