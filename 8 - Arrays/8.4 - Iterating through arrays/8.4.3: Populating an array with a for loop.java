import java.util.Scanner;

public class StoreGuesses {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_GUESSES = 3;
      int[] userGuesses = new int[NUM_GUESSES];
      int i;

      /* Your solution goes here  */
      for (i = 0; i < userGuesses.length; ++i){
         userGuesses[i] = scnr.nextInt(); 
      }

      for (i = 0; i < userGuesses.length; ++i){
         System.out.print(userGuesses[i] + " ");
      }
   }
}
