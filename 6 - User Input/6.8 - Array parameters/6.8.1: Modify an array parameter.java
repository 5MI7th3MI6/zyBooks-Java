import java.util.Scanner;

public class ModifyArray {

   public static void swapArrayEnds(int[] sortArray) {
      int tmpVal; 
      
      tmpVal = sortArray[0]; 
      sortArray[0] = sortArray[sortArray.length -1]; 
      sortArray[sortArray.length -1] = tmpVal; 
      
   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numElem = 4;
      int[] sortArray = new int[numElem];
      int i;
      int userNum;

      for (i = 0; i < sortArray.length; ++i) {
         sortArray[i] = scnr.nextInt();
      }

      swapArrayEnds(sortArray);

      for (i = 0; i < sortArray.length; ++i) {
         System.out.print(sortArray[i]);
         System.out.print(" ");
      }
      System.out.println("");
   }
}
