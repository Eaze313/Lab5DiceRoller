/**
 * James Bryant II
 * 4/4/17
 * Lab5DiceRoller.java
 *
 * This program simulates Dice Rolling
 *
 * Extended Challenges :
 * (1) Display Special Messages for craps, snake eyes, and box cars
 *
 */

package bootcamp;
import java.util.Scanner;

    public class Validation {
        public static String getString(Scanner sc, String prompt) {
            System.out.print(prompt);
            String s = sc.next();  // read user entry

            sc.nextLine();  // discard any other data entered on the line
            return s;
        }

        public static int getInt(Scanner sc, String prompt) {
            int i = 0;
            boolean isValid = false;
            while (isValid == false) {
                System.out.print(prompt);
                if (sc.hasNextInt()) {
                    i = sc.nextInt();
                    isValid = true;
                } else {
                    System.out.println("Error! That's not a valid number. Try again.");
                }
                sc.nextLine();  // discard any other data entered on the line
            }
            return i;
        }


    }


