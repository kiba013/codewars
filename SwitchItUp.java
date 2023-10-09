package codewars;

/**
 * When provided with a number between 0-9, return it in words.
 *
 * Input :: 1
 *
 * Output :: "One".
 */
public class SwitchItUp {
    public static void main(String[] args) {
        System.out.println(switchItUp(5));
    }

    public static String switchItUp(int number) {
        return switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Zero";
        };
    }
}
