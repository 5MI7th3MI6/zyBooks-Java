import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;

      seedVal = scnr.nextInt();
      randGen.setSeed(seedVal);

      int rand1; 
      int rand2; 
      rand1 = randGen.nextInt(10); 
      rand2 = randGen.nextInt(10); 
      System.out.println(rand1+ "\n" + rand2); 
      

   }
}
