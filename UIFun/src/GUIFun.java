import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIFun extends JFrame {
	
	private JLabel item1;
	
	public GUIFun() {
		super("Ohhhh yeeeaahhhh!");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a scentence");
		item1.setToolTipText("Oh yeah baby yeah!");
		add(item1);
		
		
		
		
		
		
		
	}
	
		
		
	
	

	
}
