import java.util.Scanner;

public class CourseGradePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int [] courseGrades = new int[NUM_VALS];
      int i;

      for (i = 0; i < courseGrades.length; ++i) {
         courseGrades[i] = scnr.nextInt();
      }

      for (int o = 0; o < courseGrades.length; ++o) { 
         System.out.print(courseGrades[o] + " ");   
      }  
      System.out.println(); 
      
      for (int p = courseGrades.length - 1; p >= 0; --p) {
         System.out.print(courseGrades[p] + " ");   
      }
      System.out.println(); 
   }
}
