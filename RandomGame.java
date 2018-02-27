package randomgame;
import java.util.Scanner;
public class RandomGame {

    public static void main(String[] args) {
        int randomNumber = (int)(Math.random()*100)+1;
        boolean isGuessed= false;
        System.out.println("Hello, this is a game. You need to guess the number [1-100]");
        System.out.println("Let`s start!");
        
        for(int i=10;i>0;i--){
        System.out.println("You have "+i+"guesses left.");    
        Scanner scanner= new Scanner(System.in);
        int guessedNumber = scanner.nextInt();
        
        if(randomNumber>guessedNumber){
              System.out.println("Random number is greater than your number. Try again.");
        }
        if(randomNumber<guessedNumber){
              System.out.println("Random number is smaller than your number. Try again.");
        }
        if(randomNumber==guessedNumber){
              isGuessed=true;
              break;
        }
    }
        if(isGuessed){
            System.out.println("You win. This number is "+randomNumber);
        }
        else
            System.out.println("You lose. Game over. This number was "+randomNumber);
 }
    
}