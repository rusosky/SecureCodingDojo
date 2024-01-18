public class SQLConnection {
    public static void main(String[] args) {
        String userInput = "'; DROP TABLE users; --";
        
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            String query = "SELECT * FROM users WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userInput);
            
            ResultSet result = preparedStatement.executeQuery();
            
            while (result.next()) {
                System.out.println("User: " + result.getString("username"));
            }
            
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
