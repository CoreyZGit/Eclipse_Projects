package AutomationPackage;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class AutomationMain {
	
	static String landingPage;
	static Boolean giveaway;
	static Boolean branch;
	static Boolean advanced;
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
		SignUpNewUser sunu = new SignUpNewUser();
		CreateCampaign cc = new CreateCampaign();
		AddItemDelete aid = new AddItemDelete();
		
		System.out.println("Choose the corresponding number for the automation you would like to run.  Then press ENTER.\n" 
						 + "1 : SHARE COLLECTION TO CLUB\n"
						 + "2 : ENTER CAMPAIGN\n"
						 + "3 : NEW USER SIGN UP\n"
						 + "4 : CREATE CAMPAIGN\n"
						 + "5 : ADD ITEM");
		
			stringInput = input.nextLine();
			
			breakLoop = true;

		while(breakLoop){
			
			if(stringInput.equals("1")) {
				
				chosenAutomation = "SHARE COLLECTION TO CLUB";
				SetIterations();
				
				startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());			
				
				System.out.println("Starting Automation.\n");
				
				while(iterations != 0) {
									
					sctcd.startAutomation();
					iterations--;
					
				}
				
				showTime();
				breakLoop = false;
				
				
			}else if(stringInput.equals("2")) {
				
				final String campaignLink;
				chosenAutomation = "ENTER CAMPAIGN";
				campaignLink = JOptionPane.showInputDialog("Please input a valid campaign link (Branch link preferred)");
				SetIterations();
				
				startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
				
				System.out.println("Starting Automation.\n");
				
				while(iterations != 0) {
					
					ec.startAutomation(campaignLink);
					iterations--;
					
				}		
				
				showTime();
				breakLoop = false;
				
			}else if(stringInput.equals("3")) {
				
				final String stringInterests;
				final String stringClubs;
				final String stringBCK;
				int numberInterests;
				int numberClubs;
				int numberBCK;
				
				chosenAutomation = "NEW USER SIGN UP";
				
				stringInterests = JOptionPane.showInputDialog("Enter Number of interests to select. (Between 3 and 23)\n");
				
				try {
					
					numberInterests = Integer.parseInt(stringInterests);
					if(numberInterests > 23 || numberInterests < 3) {
						
						System.out.println("Error! Invalid input, will execute automation with selection of 3 interests.\n");
						numberInterests = 3;
						
					}			
				
				}catch(NumberFormatException e){
					
					System.out.println("Error! Invalid input, will execute automation with selection of 3 interests.\n");
					numberInterests = 3;
					
				}
								
				stringClubs = JOptionPane.showInputDialog("Enter number of clubs to join.\n (Between 3 and 150");
				
				try {
					
					numberClubs = Integer.parseInt(stringClubs);
					if(numberClubs > 150 || numberClubs < 3) {
						
						System.out.println("Error! Invalid input, will execute automation with selection of 3 clubs.\n");
						numberClubs = 3;
						
					}	
					
					
				}catch(NumberFormatException e){
					
					System.out.println("Error! Invalid input, will execute automation with selection of 3 clubs.\n");
					numberClubs = 3;
					
				}
				
				stringBCK = JOptionPane.showInputDialog("Enter number of BCK's to select. (Between 0 and 6)\n");
				
				try {
					
					numberBCK = Integer.parseInt(stringBCK);
					if(numberBCK > 6 || numberBCK < 0) {
						
						System.out.println("Error! Invalid input, executing automation with selection of 0 BCK's.\n");
						numberBCK = 0;
						
					}	
				
				}catch(NumberFormatException e){
					
					System.out.println("Error! Invalid input, executing automation with selection of 0 BCK's.\n");
					numberBCK = 0;
					
				}
				
				
				SetIterations();
				
				startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());	
				
				System.out.println("Starting Automation.\n");
				
				while(iterations != 0) {
					
					sunu.startAutomation(numberInterests, numberClubs, numberBCK);
					iterations--;
					
				}		
				
				showTime();
				breakLoop = false;
				
			}else if(stringInput.equals("4")) {
				

				chosenAutomation = "CREATE CAMPAIGN";
				
				CreateCampaignGUI gui = new CreateCampaignGUI();
				
				landingPage = null;
					
				while(landingPage == null) {
					
					landingPage = gui.getLandingPage();
					giveaway = gui.getGiveaway();
					branch = gui.getBranch();
					advanced = gui.getAdvanced();
					
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
								
				}				
				
				SetIterations();
				
				startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());		
				
				System.out.println("Starting Automation.\n");
				
				while(iterations != 0) {
					
					cc.startAutomation(landingPage, giveaway, branch, advanced);
					iterations--;
					
				}		
				
				showTime();
				breakLoop = false;
				
			}
			
			else if(stringInput.equals("5")) {
				
				chosenAutomation = "ADD ITEM";
				
				AddItemDeleteGUI gui = new AddItemDeleteGUI();
				
				SetIterations();
				
				startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());			
				
				System.out.println("Starting Automation.\n");
				
				while(iterations != 0) {
									
					aid.startAutomation();
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
            
            if(seconds <= 9){
            	
            	automationTime = String.format("FULL AUTOMATION COMPLETED IN %d:0%d.\n", minutes, seconds);	
            	
            }else {
            	
            	automationTime = String.format("FULL AUTOMATION COMPLETED IN %d:%d.\n", minutes, seconds);	
            
            }
            
		}else {
			
			automationTime = String.format("FULL AUTOMATION COMPLETED IN " + timeInt + " SECONDS.\n");
			
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
