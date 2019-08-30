import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;




public class EventHandler extends JFrame {
	
	//Set variables used to represent and configure text fields.
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	
	//Set variables used to represent a text field for passwords.
	private JPasswordField password;
	
	//Create constructor of class to be called in main method.  Essentially this is the general layout and configurations of the window.
	public EventHandler() {
		
		super("Oh yeahhh babyy!");   //Title of the window
		setLayout(new FlowLayout()); //Creates a flow layout with centered alignment and a default 5 unit horizontal and vertical gap.
		
		
		//Setting specific attributes of each text field.
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("enter text here");
		add(item2);
		
		item3 = new JTextField("Your a bitch!", 10);
		item3.setEditable(false);						//Set true or false to make text field editable.
		add(item3);								  
		
		password = new JPasswordField("password");
		add(password);
		
		thehandler handler = new thehandler();		//Sets the created fields to anticipate user action.
		item1.addActionListener(handler);
		item2.addActionListener(handler);			//Takes object that implements ActioListener as argument.  Simply put this code is just telling the variables to expect an action.
		item3.addActionListener(handler);
		password.addActionListener(handler);
	
	}
	

	private class thehandler implements ActionListener{      //This class is the determines what code will execute upon action with JTextfield variables.
		
		public void actionPerformed(ActionEvent event) {	 //Method must have this name to handle the events.  Variable 'event' means enter or click.
			
			String string = "";		//Used for final output string
			
			if(event.getSource() == item1) 											//If clicked enter on text field one.  getSource() means location of action.
				string = String.format("field 1: %s", event.getActionCommand());	//Set string variable equal to the corresponding format.  
	   																				//event.getActionCommand()- get text from the referenced location.
	   else if(event.getSource() == item2) 											//Format describes output in window.
				string = String.format("field 2: %s", event.getActionCommand());
	   
	   else if(event.getSource() == item3) 
				string = String.format("field 3: %s", event.getActionCommand());	
	   
	   else if(event.getSource() == password) 
				string = String.format("password field is: %s", event.getActionCommand());		
	   
				
				
			JOptionPane.showMessageDialog(null, string);
		}
			
		
	}
	
}	
			
			
			
		
		
		
		
		
	
	
	
	
	
	
	

