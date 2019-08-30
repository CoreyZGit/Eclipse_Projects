
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.nio.file.*;

public class DocumentScore {
	
	private String writeToFile;
	
	public void Document(String submission, String difficulty, int intpercent) throws IOException {

	FileWriter fw = new FileWriter("C:\\Users\\ZUser\\Desktop\\Java\\MathScores.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw);  
    			
	writeToFile = String.format( "%s | %s | %s\n", submission, "Difficulty: " + difficulty, "Grade: " + intpercent);	
	out.println(writeToFile);	
	out.close();
	System.exit(0);
		
}
}



	
	
	
	
	


		
		
	
	


