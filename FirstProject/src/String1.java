public class String1 {
    public static void main(String[] args) {
        // Creating strings
        String greeting = "Hello";
        String name = "World";

        // Concatenation (joining two strings)
        String message = greeting + " " + name;

        // Print the concatenated string
        System.out.println("Message: " + message);

        // String length
        System.out.println("Length: " + message.length());

        // Accessing characters
        System.out.println("First character: " + message.charAt(0));
        System.out.println("Last character: " + message.charAt(message.length() - 1));

        // Changing case
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());

        // Checking if the string contains a word
        System.out.println("Contains 'World'? " + message.contains("World"));

        // Replace a word
        String newMessage = message.replace("World", "Java");
        System.out.println("Replaced Message: " + newMessage);
    }
}
