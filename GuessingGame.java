
import java.util.Scanner;

public class GuessingGame {
    public static void guessingNumber(){
        Scanner sc  = new Scanner(System.in);

        int number = 1 + (int)(100 * Math.random());

        int k = 5;

        System.out.println("Choose a number between 1 to 100.");
        System.out.println("You have just " + k + "attempts to guess the correct number.");
    
        for(int i = 0; i < k; i++){
            System.out.println("Enter your guess number: ");
            int guessNumber = sc.nextInt();

            if(guessNumber == number){
                System.out.println("Congratulations! You guessed the correct number.");
                sc.close();
                return;
            }else if (guessNumber < number) {
                System.out.println("The number is greater then " + guessNumber);
            }else{
                System.out.println("The number is less then " + guessNumber);
            }
        }

        System.out.println(
            "You've exhausted all attempts. The correct number was: "
            + number);

        sc.close();
    
    }

    public static void main(String[] args) {
        guessingNumber();
    }
}
