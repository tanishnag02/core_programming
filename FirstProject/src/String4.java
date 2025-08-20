class String4 {

    // Method that takes a String as parameter and returns a modified String
    public static String greetUser(String name) {
        return "Hello, " + name + "!";
    }

    // Method that takes a String array as parameter and prints each element
    public static void printMessages(String[] messages) {
        System.out.println("Messages:");
        for (String message : messages) {
            System.out.println("- " + message);
        }
    }

    public static void main(String[] args) {
        // Pass a single string
        String greeting = greetUser("Alice");
        System.out.println(greeting); // Output: Hello, Alice!

        // Pass a string array
        String[] myMessages = {"Welcome", "How are you?", "Goodbye!"};
        printMessages(myMessages);
    }
}

