import java.util.Scanner;
public class NestedLoops {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();
      
      currentRow = 1; 
      while (currentRow <= numRows) {
         currentColumnLetter = 'A';
         currentColumn = 1; 
         while (currentColumn <= numColumns) {
            System.out.print("" + currentRow + currentColumnLetter + " "); 
            ++currentColumnLetter; 
            ++currentColumn;
         }
         ++currentRow; 
      }         
      System.out.println("");
   }
}
