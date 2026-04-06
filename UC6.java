public class GreetingApp {
    public static void main(String[] args) {

        // If no arguments → default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String names = "";

            // Enhanced for loop to build string
            for (String name : args) {
                names += name + ", ";
            }

            // Remove trailing ", " using substring
            names = names.substring(0, names.length() - 2);

            // Final output
            System.out.println("Hello, " + names + "!");
        }
    }
}
