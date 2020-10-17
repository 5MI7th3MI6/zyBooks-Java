import java.util.Scanner;

public class AutoBidder {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      char keepGoing;
      int nextBid;

      nextBid = 0;
      keepGoing = 'y';

      while (keepGoing != 'n') {
         nextBid = nextBid + 3;
         System.out.println("I'll bid $" + nextBid + "!");
         System.out.print("Continue bidding? (y/n) ");
         keepGoing = scnr.next().charAt(0);
      }
      System.out.println("");
   }
}
