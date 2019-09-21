package AutomationPackage;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AutomationMain {
	
	static int iterations;
	static String start;
	static String stringCompare;
	static long endTime;
	static long startTime;
	static int timeInt;
	static int minutes;
	static int seconds;
	
	public static void main(String[] args) {
		
		ShareCollectionToClubDelete sctcd = new ShareCollectionToClubDelete();
		Scanner input = new Scanner(System.in);
		Scanner begin = new Scanner(System.in);
		
		System.out.println("Gemr Automation Intitiating...\n");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Input desired number of iterations then press ENTER.\n" 
						 + "Automation: Share Collection To Club\n" );

		SetIterations(input, begin);
		
		startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		
		while(iterations != 0) {
			
			System.out.println("Starting Automation.\n");
			sctcd.StartAutomation();
			iterations--;
				
		}
		
		endTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());		
		timeInt = (int)Math.round(endTime - startTime);
		
		if(timeInt > 60) {
			
			minutes = timeInt / 60;
            seconds = timeInt % 60;	
			
			System.out.printf("Full automation completed in %d:%d.\n", minutes, seconds);	
			
		}else {
			
			System.out.println("Full automation completed in " + seconds + " seconds.\n");
			
		}
		
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