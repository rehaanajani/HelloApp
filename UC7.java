public class GreetingApp {
    public static void main(String[] args) {

        // If no arguments → default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join names with ", "
            String names = String.join(", ", args);

            // Print final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}
