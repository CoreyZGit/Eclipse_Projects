
import java.util.Scanner;

public class BeginQuest {

	public static void main(String[] args) {
		

		
		Scanner inputstatus = new Scanner(System.in);	
		DragonQuest QuestObj = new DragonQuest();	
			
			System.out.println("Please enter your name.");
			String name = inputstatus.nextLine();
		
		
			System.out.println("Hello " + name + ", Welcome to Corzeland.\n"
					         + "In his land of fantasy and wonder you will begin your epic journey.\n"
					         + "You may press enter when you are ready. Don't fuck up!");

			inputstatus.nextLine();
			
			System.out.println("Lord " + name + "!  A mysterious golden dragon has been flying overhead threatening our peaceful village.  We believe it lives within the Cave of Darkness to the north!\n"
							 + "Help us Lord " + name + " and go slieght the mysterious dragon before it returns. First you will need the 'Blade of Zorey' to the east as well as the 'Sheild of Light' hurry now and don thy long johns!\n"
							 + "(Press enter)");
			
			QuestObj.Begin();
	
	
	
	}
	
	
	
}
