class String5 {
    public static void main(String[] args) {
        String text = "  Hello World!  ";

        // trim()
        String trimmedText = text.trim();
        System.out.println("Trimmed: \"" + trimmedText + "\"");

        // length()
        System.out.println("Length: " + trimmedText.length());

        // charAt()
        char fifthChar = trimmedText.charAt(4);
        System.out.println("Character at index 4: " + fifthChar);

        // concat()
        String greeting = "Welcome, ";
        String name = "Alice";
        String fullGreeting = greeting.concat(name);
        System.out.println("Concatenated: " + fullGreeting);

        // equals()
        boolean isEqual = name.equals("Alice");
        System.out.println("Equals 'Alice'? " + isEqual);

        // toCharArray()
        char[] charArray = trimmedText.toCharArray();
        System.out.print("Characters: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // substring()
        String sub = trimmedText.substring(0, 5);
        System.out.println("Substring (0, 5): " + sub);

        // toLowerCase()
        System.out.println("Lowercase: " + trimmedText.toLowerCase());

        // toUpperCase()
        System.out.println("Uppercase: " + trimmedText.toUpperCase());
    }
}

