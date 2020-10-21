// ===== Code from file DogLicense.java =====
public class DogLicense {
   private int licenseYear;
   private int licenseNum;

   public void setYear(int yearRegistered) {
      licenseYear = yearRegistered;
   }

   // FIXME: Write createLicenseNum()

   /* Your solution goes here  */
   public int createLicenseNum(int customID) {
      licenseNum = (100000 * customID) + licenseYear; 
      return licenseNum; 
   }

   public int getLicenseNum() {
      return licenseNum;
   }
}
// ===== end =====

// ===== Code from file CallDogLicense.java =====
import java.util.Scanner;

public class CallDogLicense {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      DogLicense dog1 = new DogLicense();
      int userYear;
      int userId;

      userYear = scnr.nextInt();
      userId = scnr.nextInt();

      dog1.setYear(userYear);
      dog1.createLicenseNum(userId);
      System.out.println("Dog license: " + dog1.getLicenseNum());

   }
}
// ===== end =====
