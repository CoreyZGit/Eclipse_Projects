	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.awt.*;
	import javax.swing.*;
	import javax.swing.JFrame;

	
public class BugBusterMain extends JFrame{
	
	public static String sprint; 
	public static String platform;
	public static String description;
	public static String tags;
	public static String specific;
	public static String other;
	public static String[] finalReport = new String[6];
	public static int info;
	
	
	public static void main(String args[]){
		
		BasicInfo promptDate = new BasicInfo();
		
		while(sprint == null) {
			
			sprint = promptDate.getDateSprint();
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		}
		
		finalReport[0] = sprint;
		
		SelectPlatform promptPlat= new SelectPlatform();
	
	
		while(platform == null) {
		
			platform = promptPlat.getPlatform();
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
		
		finalReport[1] = platform;
		
		AddDescription promptDesc = new AddDescription();
	
		while(description == null) {
		
			description = promptDesc.getDescription();
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		finalReport[2] = description;
	
		AdditionalInfo promptAdd = new AdditionalInfo();
	
		while(info == 0) {
		
			info = promptAdd.getInfo();
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		}
		
		tags = promptAdd.getTags();
		specific = promptAdd.getBrowsersDevices();
		other = promptAdd.getOther();
		
		finalReport[3] = tags;
		finalReport[4] = specific;
		finalReport[5] = other;						
		System.out.println(tags);
		System.out.println(specific);
		System.out.println(other);		
		
		FormatText promptFormat = new FormatText(finalReport);
					

	}
}
		   	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

