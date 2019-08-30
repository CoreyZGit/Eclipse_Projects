import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ColorChooser extends JFrame {
	
	private JButton button;
	private Color color = (Color.WHITE);
	private JPanel panel;
	
	public ColorChooser() {
		
		super("Color Chooser Window");
		panel = new JPanel();
		panel.setBackground(color);
		
		button = new JButton("Choose a color!");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						color = JColorChooser.showDialog(null, "Pick your color!", color);
						if(color == null)
							color = (Color.WHITE);
						
						panel.setBackground(color);
						
						
				}
		}
				
				
				
				
	
	);
		
		
	add(panel, BorderLayout.CENTER);
	add(button, BorderLayout.SOUTH);
	setSize(450, 120);
	setVisible(true);
		
		
		
	}
	
	
	

}
