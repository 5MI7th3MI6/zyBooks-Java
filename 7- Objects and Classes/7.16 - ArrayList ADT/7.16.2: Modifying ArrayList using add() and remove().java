import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListADT {
   public static void printArrayList(ArrayList<Integer> numsList) {
      int i;

      for (i = 0; i < numsList.size(); ++i) {
         System.out.print(numsList.get(i));
         System.out.print(" ");
      }

      System.out.println("");
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> numsList = new ArrayList<Integer>();
      int userInput;
      int i;

      for (i = 0; i < 3; ++i) {
         userInput = scnr.nextInt();
         numsList.add(userInput);
      }

      /* Your solution goes here  */
      numsList.remove(1); 
      numsList.add(0, 100); 
      numsList.add(2, 102); 

      printArrayList(numsList);
   }
}
