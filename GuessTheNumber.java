package codsoft;
import java.util.Scanner;
class GuessTheNumber 
{
    public static void guessNum()
    {
        int num,guess;
        int k=5;
        int score=0;
        int i;
        boolean playAgain = true;
        num=(int)(Math.random()*100) + 1;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess any number between 1 to 100.");
        System.out.println("You have 5 attempts to guess the correct number.");
        System.out.println(" ");
       while(playAgain){ 
        for(i=0;i<k;i++)
        {
            System.out.println("Enter the guess:");
            guess=sc.nextInt();
            
            if(guess==num)
            {
                System.out.println("Congratulations!" + " " + "You guessed the right number !");
                score++;
                break;
            }
            else if(guess>num)
            {
                System.out.println("Your guess is too high!\nYou have " + (k-i-1)+ " attempts left.");
            }
            else
            {
                System.out.println("Your guess is too low!\nYou have " + (k-i-1) + " attempts left.");
            }
           
        }
        
        System.out.println(" ");
        if(i==k)
        {
            System.out.println("You ran out of attempts!\nYou Lose!");
        }
        
        System.out.println(" ");
        System.out.println("Do you want to play again? (Yes/No)");
        String choice=sc.next();
        if(choice.equalsIgnoreCase("yes"))
        {
            continue;
        }
        else
        {
            playAgain=false;
            break;
        }
    }
       
       System.out.println(" ");
       System.out.println("Tota number of times you have won is:" + score);
  }
}
   

