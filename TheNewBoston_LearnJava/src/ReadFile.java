import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ReadFile extends JFrame{

	private JTextField addressBar;
	private JEditorPane display;
	
	public ReadFile() {
		super("Corey's Browser");
		
		addressBar = new JTextField("Enter URL Here");
		addressBar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						loadCrap(event.getActionCommand());
						
						
					}
				}
				
				);
		
		add(addressBar, BorderLayout.NORTH);
		
		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(
				new HyperlinkListener() {
					public void hyperlinkUpdate(HyperlinkEvent event) {
						if(event.getEventType() == HyperlinkEvent.EventType.ACTIVATED);
						loadCrap(event.getURL().toString());						
					}						
				}
			);

		add(new JScrollPane(display), BorderLayout.CENTER);
		setSize(500, 500);
		setVisible(true);
		
		}
	
	private void loadCrap(String userText) {
		try {
			display.setPage(userText);
			addressBar.setText(userText);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid URL!", "Error!", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

}