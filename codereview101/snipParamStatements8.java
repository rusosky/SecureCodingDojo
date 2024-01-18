public class CommandInjectionSecure {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String username = reader.readLine();

        List<String> command = new ArrayList<>();
        command.add("echo");
        command.add("Hello, " + username);

        ProcessBuilder processBuilder = new ProcessBuilder(command);

        Process process = processBuilder.start();

        BufferedReader outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = outputReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
