
import java.util.Scanner;

/**
 * Validation class to check input.
 *
 * @author TuanPHAHE194741
 * @version 15/06/2026
 */
public class Validate {

    /**
     * A shared object used to read input data from the keyboard for the entire
     * class.
     */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Check if a positive integer is entered from the keyboard. If the entered
     * value is less than 0 or not a number, please re-enter the value.
     *
     * @param msg is information need display in screen.
     * @return a valid positive integer.
     */
    public static int checkUserInputInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String input = scanner.nextLine();

                if (input == null) {
                    System.out.println("Invalid format! Please enter again.");
                    continue;
                }
                int number = Integer.parseInt(input.trim());

                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Number must be greater than 0. Please enter again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid format! Please enter again.");
            }
        }
    }

    /**
     * Check if a string is entered from the keyboard. If nothing is entered or
     * only a blank space is provided, please re-enter the information.
     *
     * @param msg is information need display in screen.
     * @return a valid string.
     */
    public static String checkUserInputString(String msg) {
        while (true) {
            System.out.print(msg);
            String n = scanner.nextLine().trim();

            if (n == null) {
                System.out.println("Invalid format! Please enter again.");
                continue;
            }
            if (n.isEmpty()) {
                System.out.println("Invalid format! Please enter again.");
            } else {
                return n.trim();
            }
        }
    }

    /**
     * Check if a integer (form 1 to 5) is entered from the keyboard. If the
     * entered value is less than 1 or greater than 5 or not a number, please
     * re-enter the value.
     *
     * @return a valid positive integer.
     */
    public static int checkUserInputSwitchCase(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String input = scanner.nextLine();

                if (input == null) {
                    System.out.println("Invalid format! Please enter again.");
                    continue;
                }
                int number = Integer.parseInt(input.trim());

                if (number >= 1 && number <= 5) {
                    return number;
                } else {
                    System.out.println("Number must be greater than 1 and less than 5. Please enter again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid format! Please enter again.");
            }
        }
    }

    /**
     * Check if a string is entered from the keyboard.
     *
     * @param msg is information need display in screen.
     * @return a valid String or blank.
     */
    public static String checkInputUpdateString(String msg) {
        while (true) {
            System.out.print(msg);
            String n = scanner.nextLine();

            if (n == null) {
                System.out.println("Invalid format! Please enter again.");
                continue;
            }

            if (n.isEmpty()) {
                return "";
            }
            return n.trim();
        }
    }

    /**
     * Check if a positive integer is entered from the keyboard. If the entered
     * value is less than 0 or not a number, please re-enter the value.
     *
     * @param msg is information need display in screen.
     * @return a valid positive integer or blank.
     */
    public static int checkInputUpdateInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String input = scanner.nextLine().trim();

                if (input == null) {
                    System.out.println("Invalid format! Please enter again.");
                    continue;
                }
                // if string is blank.
                if (input.isEmpty()) {
                    return -1;
                }
                int number = Integer.parseInt(input);
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Number must be greater than 0. Please enter again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid format! Please enter again.");
            }
        }
    }
}
