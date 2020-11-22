import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		int age; 
		double weight; 
		double heartRate; 
		double time;
		double womenCalories;
		double womenMathP1; 
		double womenMathP2;
		double menMathP1; 
		double menMathP2; 
		double menCalories; 
		
		age = scnr.nextInt(); 
		weight = scnr.nextInt(); 
		heartRate = scnr.nextInt(); 
		time = scnr.nextInt(); 
		
		//calculations for women calories 
		womenMathP1 = (age * 0.074) - (weight * 0.05741); 
		womenMathP2 = (womenMathP1) + (heartRate * 0.4472) - 20.4022; 
		womenCalories = womenMathP2 * time / 4.184;  
		System.out.printf("Women: %.2f calories", + womenCalories);
		
		
		//calculations for men calories 
		menMathP1 = (age * 0.2017) + (weight * 0.09036); 
		menMathP2 = (menMathP1)+ (heartRate * 0.6309) - 55.0969;
		menCalories = (menMathP2) * time / 4.184; 
		System.out.printf("\nMen: %.2f calories\n", + menCalories); 
	
	}

}
