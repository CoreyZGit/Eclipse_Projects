import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui extends JFrame {
	
	private JButton reg;			//Create two variables to represent buttons.
	private JButton custom;
	
	public Gui() {
		super("Eyyyy buckoooo");	//Super allows access to superclass.  JFrame in this instance.
		setLayout(new FlowLayout());
		
		reg = new JButton("Regular Button");	//Create regular button
		add(reg);
		
		Icon h1 = new ImageIcon(getClass().getResource("heart1.png"));		//Store images in objects for Java.
		Icon h2 = new ImageIcon(getClass().getResource("heart2.png"));
		custom = new JButton("Custom", h1);  							//Create custom button.
		custom.setRolloverIcon(h2);
		add(custom);
	
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
		
	}

	private class HandlerClass implements ActionListener{		//Implements means to use the given class and methods and overwrite it.
		
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
