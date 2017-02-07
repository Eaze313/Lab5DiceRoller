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

            // call the methods

            //6. Display results
            System.out.println("Your results are: " + RollDice(sides) + " and " + RollDice(sides));

            System.out.println("Do You Want to Continue? y/n");
            answer = scan.next();
            } while (answer.equals("y"));
    }

        public static int RollDice ( int sides){
            return (int) (Math.random() * sides) + 1;
            } //end of method

    } // end main