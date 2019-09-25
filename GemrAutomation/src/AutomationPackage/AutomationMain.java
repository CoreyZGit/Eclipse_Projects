package AutomationPackage;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AutomationMain {
	
	static String stringInput;
	static String automationTime;
	static String chosenAutomation;
	static long endTime;
	static long startTime;
	static int iterations;
	static int timeInt;
	static int minutes;
	static int seconds;
	static boolean breakLoop;
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {	
		
		System.out.println("Gemr Automation Intitiating...\n");
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		chooseAutomation();
		System.out.println(automationTime);
		System.exit(0);	
		
	}		
	
	public static void chooseAutomation() {
		
		ShareCollectionToClubDelete sctcd = new ShareCollectionToClubDelete();
		EnterCampaign ec = new EnterCampaign();
		
		System.out.println("Choose the corresponding number for the automation you would like to run.  Then press ENTER.\n" 
						 + "1 : SHARE COLLECTION TO CLUB\n"
						 + "2 : ENTER CAMPAIGN\n");
		
			stringInput = input.nextLine();
			
			breakLoop = true;

		while(breakLoop){
			
			if(stringInput.equals("1")) {
				
				chosenAutomation = "SHARE COLLECTION TO CLUB";
				SetIterations();
				
				startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());			
				
				while(iterations != 0) {
					
					System.out.println("Starting Automation.\n");
					sctcd.StartAutomation();
					iterations--;
					
				}
				
				showTime();
				breakLoop = false;
				
				
			}else if(stringInput.equals("2")) {
				
				chosenAutomation = "ENTER CAMPAIGN";
				SetIterations();
				
				startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
				
				while(iterations != 0) {
					
					System.out.println("Starting Automation.\n");
					ec.StartAutomation();
					iterations--;
					
				}		
				
				showTime();
				breakLoop = false;
				
			}else {
				
				System.out.println("Error! Invalid input, enter an applicable integer value and press ENTER.\n");
				input.reset();
				stringInput = input.nextLine();
				
			}
				
		}
	}
											
	public static void showTime() {
		
		endTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());		
		timeInt = (int)Math.round(endTime - startTime);
		
		if(timeInt > 60) {
			
			minutes = timeInt / 60;
            seconds = timeInt % 60;	
			
            automationTime = String.format("Full automation completed in %d:%d.\n", minutes, seconds);	
			
		}else {
			
			automationTime = String.format("Full automation completed in " + timeInt + " seconds.\n");
			
		}		

	}
				
	public static void SetIterations() {
		
		input.reset();
		breakLoop = true;
		
		System.out.println("Input desired number of iterations then press ENTER.\n" 
						 + "Automation: " + chosenAutomation + "\n" );	
		
		stringInput = input.nextLine();
		
		while(breakLoop) {
		
			try {
			
				iterations = Integer.parseInt(stringInput);
				breakLoop = false;
			
			}catch(NumberFormatException e) {
			
				System.out.println("Error! Please enter an integer value.\n");
				input.reset();
				stringInput = input.nextLine();
			
			}
	
		}
		
		System.out.println("You have chosen iterate this automation " + iterations + " times. Type BEGIN and press ENTER to begin automation.\n" 
						 + "If you desire to terminate this automation type EXIT instead.\n");

		breakLoop = true;
		
		while(breakLoop) {		
		
		input.reset();
		stringInput = input.nextLine();
		
		if((stringInput.toUpperCase()).equals("BEGIN")) {
			
			breakLoop = false;
			
		}else if((stringInput.toUpperCase()).equals("EXIT")) {
			
			System.exit(0);
			
		}else {
			
			System.out.println("Error! Enter BEGIN or EXIT and then press ENTER.");
			breakLoop = true;
			
		}
						
	}
		
		return;
}
	
		
}
