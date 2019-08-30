

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class FormatText extends JFrame {
    
   
    private JButton generate;
    private JLabel Instruction;  
    private JButton exitReport;
    private JTextArea textArea; 
    private String bugReportString;
    private String tagsString;
  
    public FormatText(String[] bugReport){
    	
    	JFrame window = new JFrame();
           
        window.setTitle("Final Format");
        window.setSize(550, 800);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                      
        
        generate = new JButton("Generate Bug Report");
        generate.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        Instruction = new JLabel("Copy and paste this report into yout bug ticket.  Make edits if necessary.");
        Instruction.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        textArea = new JTextArea();
        textArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        JPanel panel = new JPanel();             
        panel.setLayout(new BoxLayout (panel, BoxLayout.Y_AXIS)); 
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        
        exitReport = new JButton("Exit Report");  
        exitReport.setAlignmentX(Component.CENTER_ALIGNMENT);
                      
        JCheckBox saveReport = new JCheckBox("Save Report");
        saveReport.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JTextField tags = new JTextField(24);
                   
        panel.add(Instruction);
        panel.add(generate);
        panel.add(textArea);
        panel2.add(exitReport);  
        panel2.add(saveReport);
        panel2.add(tags);
        panel.add(panel2);
        
        if(ColorClass.getGvalue() == 255 || ColorClass.getGvalue() == 51 || ColorClass.getGvalue() == 153 || ColorClass.getGvalue() == 192 || ColorClass.getGvalue() == 204)
	    {
		    
	    panel.setBackground(new Color(ColorClass.getRvalue(), ColorClass.getGvalue(), ColorClass.getBvalue()));  
	        
	    }else {
	      
	    panel.setBackground(null);
	    
	    }	
        
        panel2.setBackground(Color.GRAY);
                
        window.add(panel);
        window.setVisible(true);
        
        generate.addActionListener(
	    		new ActionListener() {
	    			public void actionPerformed(ActionEvent event) {
	    				
	    			bugReportString = String.format("%s\n%s\n%s\n\n%s\n\n%s\n\n", bugReport[0], bugReport[1], bugReport[2], bugReport[4], bugReport[5]);	    				    			
	    			textArea.setText(bugReportString);	    			
	    			tags.setText(bugReport[3]);
	    			
	    		    }    		 		
	    	    }
	    	
 );
        
            
        exitReport.addActionListener(
	    		new ActionListener() {
	    			public void actionPerformed(ActionEvent event) {
	    				
	    			SaveReport saveObj = new SaveReport();	
	    				
	    			if(saveReport.isSelected()) {
	    			    				
	    			try {
						saveObj.Save(bugReport);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
	    				
	    			}
	    			
	    			window.setVisible(false);
	    			
	    		    }    		 		
	    	    }
	    	
 );
}   
    
    
    private String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    


