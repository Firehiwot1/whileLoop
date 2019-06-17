import java.util.Scanner;
public class wh {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
                    int secretNumber; //guess is initialized to 0
                    String guess;
                    secretNumber = 123;

                    System.out.println("I'm thinking of a number between 1 and 1000");
                    System.out.print("Enter the number:");
                    guess = keyboard.nextLine();
                    int guessInt = Integer.parseInt(guess);
                    while ( guessInt !=  secretNumber )
                    {
                        System.out.println("\nYou are wrong. Try again.");
                        System.out.print("Enter the number: ");
                        guess = keyboard.nextLine();
                        if (guess.equalsIgnoreCase("break")){
                            break;
                        }
                        guessInt= Integer.parseInt( guess);
                        if( guessInt==5){
                            break;
                        }


                    }

                    System.out.println("You are correct. You win a prize!");
                    keyboard.close();
                }
            }



