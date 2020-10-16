import java.util.Scanner;

public class MultipleSalutations {
   public static void printSalutation(String personName) {
      System.out.println("Hello, " + personName);
   }

   //Define void printSalutation(String personName, String customSalutation)...

   public static void printSalutation(String personName, String customSalutation) {
      System.out.println(customSalutation + ", " + personName);   
   }

   public static void main (String [] args) {
      printSalutation("Holly", "Welcome");
      printSalutation("Sanjiv");
   }
}
