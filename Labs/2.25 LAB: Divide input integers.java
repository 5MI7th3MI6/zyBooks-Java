import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		int userNum; 
		int divNum; 
		int divOne; 
		int divTwo; 
		int divThree; 
		
		userNum = scnr.nextInt(); 
		divNum = scnr.nextInt(); 
		
		divOne = userNum / divNum; 
		divTwo = divOne / divNum; 
		divThree = divTwo / divNum; 
		
		System.out.print(divOne + " ");
		System.out.print(divTwo + " ");
		System.out.println(divThree); 
	}

}
