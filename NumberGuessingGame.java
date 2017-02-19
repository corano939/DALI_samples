import java.util.Scanner;
public class NumberGuessingGame {
      public static void main(String[] args) {
 int Die;
 Die= (int) (Math.random() * 5 + 1);
 
 Scanner keyboard = new Scanner(System.in);
 int guess;
 
 do {System.out.print("Enter a guess for the die (1-6): ");
 guess = keyboard.nextInt();
 System.out.println("Your guess is " + guess);

 if (guess == Die) 
    System.out.println("You got it!");
 else if (guess < Die)
    System.out.println("Nah. Die is higher number.");
 else
    System.out.println("Nah. Die is lower.");
} while (guess != Die);
      }
}
