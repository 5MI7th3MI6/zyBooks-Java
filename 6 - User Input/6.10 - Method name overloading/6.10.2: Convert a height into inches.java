import java.util.Scanner;

public class FunctionOverloadToInches {

   public static double convertToInches(double numFeet) {
      return numFeet * 12.0;
   }

   public static double convertToInches(double numFeet, double numInches) {
      return numFeet * 12 + numInches;   
      
   }

   public static void main (String [] args) {
      double totInches;

      totInches = convertToInches(4.0, 6.0);
      System.out.println("4.0, 6.0 yields " + totInches);

      totInches = convertToInches(5.8);
      System.out.println("5.8 yields " + totInches);
   }
}
