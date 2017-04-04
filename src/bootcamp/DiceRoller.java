/**
 * James Bryant II
 * Edited on 4/4/17
 * Lab5DiceRoller.java
 *
 * This program simulates Dice Rolling
 *
 * Extended Challenges :
 * (1) Display Special Messages for craps, snake eyes, and box cars
 *
 */

package bootcamp;
import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sides;
        String answer;


        //Greet User!!!
        String name = GreetExit.hello(scan);



        do {

            sides = Validation.getInt(
                    scan, name + ", How many sides do your dice have?\n");

            //Method call

            /*Display results by printing the Pair of Dice Method,
            Which calls the RollDice method twice to populate results*/
            
                System.out.println(PairOfDice(RollDice(sides), RollDice(sides)));



            System.out.println();
            answer = Validation.getString(scan,
                    "Do You Want to Continue? y/n\n").toLowerCase();

        } while (answer.equals("y"));

        GreetExit.bye(name);
}

        public static int RollDice (int sides){

            Random rand = new Random();

            return rand.nextInt(sides) +1;
        }

        public static String PairOfDice (int result1, int result2) {
            int sum = result1 + result2;

            if (sum == 2) {
                return "Snake Eyes!";
            }
            if (sum == 3) {
                return "Craps!";
            }
            if (sum == 12) {
                return "Boxcars!";
            }
            else {
                return "Your results are: " + result1 + " and " + result2 + "\n";
            }
        }
}

