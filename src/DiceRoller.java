import java.util.Scanner;
public class DiceRoller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sides;
        String answer = "";


        //Greet User!!!
        System.out.println("Hello and Welcome to James' new game called Rolling the Dice! ");
        System.out.println("");
        System.out.println("");

        do {
            System.out.println("Enter the number of sides on your die: ");
            sides = scan.nextInt();

            //Method call
            int result1 = RollDice(sides);
            int result2 = RollDice(sides);
            int sum = result1 + result2;

            if (sum == 2) {
                System.out.println("Snake Eyes!");
            }
            if (sum == 3) {
                System.out.println("Craps!");
            }
            if (sum == 12) {
                System.out.println("Boxcars!");
            }
            //Display results
            System.out.println("Your results are: " + result1 + " and " + result2);

            System.out.println("Do You Want to Continue? y/n");
            answer = scan.next();
            } while (answer.equals("y"));
    }

        public static int RollDice ( int sides){

        //casts the return to an integer
        return (int) (Math.random() * sides) + 1;

        } //end of method


    } // end main