public class CharacterTypeCheck {
    static void checkCharacters(String str) {
        int upper = 0, lower = 0, digit = 0, special = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))        upper++;
            else if (Character.isLowerCase(c))   lower++;
            else if (Character.isDigit(c))       digit++;
            else if (!Character.isWhitespace(c)) special++;
        }
        System.out.println("Uppercase letters : " + upper);
        System.out.println("Lowercase letters : " + lower);
        System.out.println("Digits            : " + digit);
        System.out.println("Special characters: " + special);
    }

    public static void main(String[] args) {
        checkCharacters("Hello@World123!");
    }
}