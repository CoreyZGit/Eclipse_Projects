import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PaintClass extends JPanel{
	
    public void paintComponent(Graphics g) {
    	
    	super.paintComponents(g);
    	
    	g.setColor(Color.BLUE);
    	g.drawRect(5, 250, 580, 200);
    	
    	
    }

}
