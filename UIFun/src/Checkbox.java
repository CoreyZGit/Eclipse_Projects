import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Checkbox extends JFrame {

	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	public Checkbox() {
		
		super("Heyyy yeahhh!");
		setLayout(new FlowLayout());
		
		tf = new JTextField("This is a scentence!", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		add(tf);
		
		boldbox = new JCheckBox("Bold");
		italicbox = new JCheckBox("Italic");
		add(boldbox);
		add(italicbox);
		
		HandlerClass handler = new HandlerClass(); 
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
				
		
	}
	
private class HandlerClass implements ItemListener{
		
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			
			if(boldbox.isSelected() && italicbox.isSelected())
			font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			
	   else if(boldbox.isSelected())
			font = new Font("Serif", Font.BOLD , 14);
			
	   else if(italicbox.isSelected())
			font = new Font("Serif", Font.ITALIC , 14);	
						
	      else				
			font = new Font("Serif",Font.PLAIN,14);
			
			tf.setFont(font);
			
		}
		
		
		
		
	}
	
	
	
}
