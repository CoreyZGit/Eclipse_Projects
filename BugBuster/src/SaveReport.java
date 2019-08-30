import java.io.*;
import javax.swing.JOptionPane;
import java.util.Formatter;

public class SaveReport {		
	
	public void Save(String[] bugReport) throws IOException {
		
	File file = new File("C:\\Users\\ZUser\\Desktop\\Bug Report.txt");	
	
	if(file.exists()) {
		
	try {
		
		FileWriter fw = new FileWriter("C:\\Users\\ZUser\\Desktop\\Bug Report.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);  
    			
		out.println(bugReport[0] + "\n");
		out.println(bugReport[1] + "\n");
		out.println(bugReport[2] + "\n\n");
		out.println(bugReport[3] + "\n\n");
		out.println(bugReport[4] + "\n\n");
		out.println(bugReport[5] + "\n\n");
		out.close();
		JOptionPane.showMessageDialog(null, " Your report has been saved!", "Success!", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);		
	
	}catch(Exception e) {
		
		JOptionPane.showMessageDialog(null, "Error saving report!", "Error", JOptionPane.ERROR_MESSAGE);
						
	}
	
	}else { 

		final Formatter createFile;	
		createFile = new Formatter("C:\\Users\\ZUser\\Desktop\\Bug Report.txt");
		createFile.close();
		
		FileWriter fw = new FileWriter("C:\\Users\\ZUser\\Desktop\\Bug Report.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);  
    			
		out.println(bugReport[0] + "\n");
		out.println(bugReport[1] + "\n");
		out.println(bugReport[2] + "\n\n");
		out.println(bugReport[3] + "\n\n");
		out.println(bugReport[4] + "\n\n");
		out.println(bugReport[5] + "\n\n");
		out.close();
		JOptionPane.showMessageDialog(null, " Your report has been saved!", "Success!", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	
		}
	}		
}
