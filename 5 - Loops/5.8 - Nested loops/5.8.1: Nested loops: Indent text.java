import java.util.Scanner;
public class NestedLoop {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int i;
      int j;

      userNum = scnr.nextInt();            
      i = 0; 
      j = 0;
      while (i <= userNum) {
         for (i = 1; i <=j; ++i){
            System.out.print(" ");
         }
         System.out.println(j); 
         ++j; 
      }             
   }
}
