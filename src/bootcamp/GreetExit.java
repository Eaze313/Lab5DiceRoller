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
class GreetExit {
    Scanner scan = new Scanner(System.in);
    //Method - Greets the User
    static String hello(Scanner scan) {
        //Greeting and UserName Request

        String user = Validation.getString(
                scan, "Hello and Welcome to James' new game called Rolling the Dice!\n" +
                        "Please tell me your name?\n");

        return user;
    }

    //Method - Farewells the User
    static String bye(String userName) {
        return "\nFarewell " + userName + ",\nUntil Next Time!!!";
    }




}
