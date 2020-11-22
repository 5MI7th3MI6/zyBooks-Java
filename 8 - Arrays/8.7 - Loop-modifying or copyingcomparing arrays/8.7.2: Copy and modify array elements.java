import java.util.Scanner;
public class StudentScores {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] oldScores = new int[SCORES_SIZE];
      int[] newScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < oldScores.length; ++i) {
         oldScores[i] = scnr.nextInt();
      }

      /* Your solution goes here  */
      for (i = 0; i < oldScores.length; ++i) { 
         if (i == oldScores.length - 1) {
            newScores[oldScores.length - 1] = oldScores[0];
         } 
         else { 
            newScores[i] = oldScores[i + 1]; 
         }
      } 

      for (i = 0; i < newScores.length; ++i) {
         System.out.print(newScores[i] + " ");
      }
      System.out.println();
   }
}
