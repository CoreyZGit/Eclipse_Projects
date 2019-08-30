package bugreport;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class FinalFormat extends JFrame {
    
   
    private JButton Generate;
    private JLabel Instruction;  
    private JButton ExitReport;
    private JTextArea TextArea; 
    private JPanel panel;
    private String bugReport;
  
    public FinalFormat(){
           
        super("Final Format");
        setSize(500, 740);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); 
        
        ExitReport = new JButton("Exit Report");  
        ExitReport.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        Generate = new JButton("Generate Bug Report");
        Generate.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        Instruction = new JLabel("Copy and paste this report into yout bug ticket.  Make edits if necessary.");
        Instruction.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        TextArea = new JTextArea(40,30);
        TextArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        TextArea.setLineWrap(true);
        TextArea.setWrapStyleWord(true);
           
        panel = new JPanel();
        panel.setLayout(new BoxLayout (panel, BoxLayout.Y_AXIS));        
        panel.add(Instruction);
        panel.add(Generate);
        panel.add(TextArea);
        panel.add(ExitReport);
        this.add(panel);
        
        FinalHandler fihandler = new FinalHandler();
        Generate.addActionListener(fihandler);
        ExitReport.addActionListener(fihandler);    
}  
    
    
    public class FinalHandler implements ActionListener{       
        
         BugReport BugObj = new BugReport();
         
           
    public void actionPerformed(ActionEvent event){
    
        if (event.getSource() == Generate){     
            
            bugReport = String.format("***This bug first discovered %s***\n"
                    + "\n"
                    + "***Stack Location:*** %s\n"
                    + "\n"
                    + "***Platfrom:*** %s\n" 
                    + "\n"
                    + "***Sprint or application version:*** %s\n"      
                    + "\n"
                    + "***Exists in current production version:*** %s\n"
                    + "\n"
                    + "***Browers or Devices:***\n"
                    + "%s\n"
                    + "\n"
                    + "***Description:***\n"
                    + "%s\n"
                    + "\n"
                    + "***Steps to reproduce:***\n"
                    + "%s\n" 
                    + "\n"
                    + "***Expected behavior:***\n"
                    + "%s\n"
                    + "\n"
                    + "***Current behavior:***\n"
                    + "%s",
                    
                    BugObj.Date, BugObj.StackLoc, BugObj.SpecPlat, BugObj.VerSprint, BugObj.SpecProd, BugObj.BrowsersDevices, 
                    BugObj.DescText, BugObj.StepsText, BugObj.ExpectedText,BugObj.ActualText);
            
            TextArea.insert(bugReport, 0);
            
            
                 
        }
        
        
        
        else if(event.getSource() == ExitReport){
            
            
            FinalFormat.this.setVisible(false);
            System.exit(0);
            
            
        }
        
        
        
    }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
