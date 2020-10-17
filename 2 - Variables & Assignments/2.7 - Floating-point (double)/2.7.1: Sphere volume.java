import java.util.Scanner;

public class SphereVolumeCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double piVal = 3.14159;
      double sphereVolume;
      double sphereRadius;

      sphereRadius = scnr.nextDouble();

      sphereVolume = (4.0/3.0) * (piVal) * sphereRadius * sphereRadius * sphereRadius; 

      System.out.println(sphereVolume);
   }
}
