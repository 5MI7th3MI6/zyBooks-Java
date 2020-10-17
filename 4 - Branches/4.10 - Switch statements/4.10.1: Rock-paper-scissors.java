import java.util.Scanner;

public class Roshambo {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int nextChoice;

      nextChoice = scnr.nextInt();

      
      switch (nextChoice){ 
         case 0: 
            System.out.println("Rock"); 
            break; 
         
         case 1: 
            System.out.println("Paper"); 
            break; 
         
         case 2: 
            System.out.println("Scissors"); 
            break; 
            
         case 3: 
            System.out.println("Unknown"); 
            break; 
      } 

   }
}
