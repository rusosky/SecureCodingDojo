public class Command {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String username = reader.readLine();
        
        String command = "echo Hello, " + username;
        
        Process process = Runtime.getRuntime().exec(command);

        BufferedReader outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = outputReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
