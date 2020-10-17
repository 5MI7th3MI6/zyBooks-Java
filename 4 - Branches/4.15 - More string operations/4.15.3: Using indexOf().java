import java.util.Scanner;

public class CensoredWords {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;

      userInput = scnr.nextLine();
         
      if (userInput.contains("darn")){
         System.out.println("Censored"); 
      }
      else{
         System.out.println(userInput); 
      }
   }
}
