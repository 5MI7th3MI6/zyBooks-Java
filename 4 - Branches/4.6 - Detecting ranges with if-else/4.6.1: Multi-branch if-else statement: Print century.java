import java.util.Scanner;

public class YearChecker {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int givenYear;

      givenYear = scnr.nextInt();

      if (givenYear >= 2101){
         System.out.print("Distant future"); 
      } 
      else if (givenYear >= 2001){
         System.out.print("21st century"); 
      } 
      else if (givenYear >= 1901){
         System.out.print("20th century"); 
      } 
      else{
         System.out.print("Long ago"); 
      } 

   }
}
