import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();
        System.out.println("------------------------------------Welcome to the World of Gamming Era------------------------------------");
        while(true){
            System.out.println("Now you will play Guess the number game - > ");
            System.out.println("Select the level : 1. Easy \n 2. Medium \n 3.Hard");
            int level = sc.nextInt();
            int attempts = 0;
            if(level==1){
                attempts = 10;
            }
            else if(level==2){
                attempts = 7;
            }
            else if(level== 3){
                attempts = 4;
            }
            System.out.println("Guess a number between 1 to 100 : ");
            int num = random.nextInt(100);
            int total = attempts;
            while(attempts-- > 0){
                int guessedNum = sc.nextInt();
                if(guessedNum < num){
                    System.out.println("Guessed number is too small.");
                    System.out.println("You have attempts left : " + attempts);
                    System.out.println("Enter a higher number.");
                }
                else if(guessedNum > num){
                    System.out.println("Guessed number is too big.");
                    System.out.println("You have attempts left : " + attempts);
                    System.out.println("Enter a smaller number.");
                }
                else{
                    System.out.println("Correctly guessed");
                    System.out.println("Your guessing percentage is " + (attempts+1/total)*100);
                    break;
                }
            }
            System.out.println("Do you want to play more : ");
            String ans = sc.next();
            if(ans.toLowerCase().equals("no")){
                break;
            }
        }
        System.out.println("Thanks for playing.");
    }
}
