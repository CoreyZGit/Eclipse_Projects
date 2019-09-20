package SeleniumAutomations;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AutomationMain {
	
	static int iterations;
	static String start;
	static String stringCompare;
	
	public static void main(String[] args) {
		
		SeleniumAutomations testSuite = new SeleniumAutomations();
		Scanner input = new Scanner(System.in);
		Scanner begin = new Scanner(System.in);
		
		System.out.println("Gemr Automation Intitiating...\n");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Input desired number of iterations then press ENTER.\n" 
						 + "Automation: Share Collection To Club\n" );

		SetIterations(input, begin);
		
		while(iterations != 0) {
			
			testSuite.StartAutomation();
			iterations--;
				
		}
		
		System.out.println("Automation Complete");
		
	}
	
	public static void SetIterations(Scanner input, Scanner begin) {
		
		try {
			
			iterations = input.nextInt();
			System.out.println("You have chosen iterate this automation " + iterations + " times. Type BEGIN and press ENTER to begin automation.\n" 
							 + "If you desire to reset the number of iterations, type RESET and then press ENTER.\n");
			
			start = begin.nextLine();
			stringCompare = start.toUpperCase();
			 
			if(start.equals(stringCompare)) {
				 
				return;
				 
			 }else {
				 
					System.out.println("Input desired number of iterations then press ENTER.\n" 
									 + "Automation: Share Collection To Club\n" );					
					
					SetIterations(input, begin);				 
			 }
		
		}catch(InputMismatchException e){
						
			System.out.println("Error! Please Enter Interger Input.\n");
			input = null;
			SetIterations(input, begin);
		}
		
		
				
	}
	
}