import java.io.*;
import java.util.*;
import java.lang.*;

public class CreateFile {

	private Formatter x;
	private Scanner get;
	
	public void openFile() {
		
		try {
			
			x = new Formatter("chinese.txt");
			get = new Scanner(new File("chinese.txt"));
			
		}catch(Exception e) {
			
			System.out.println("This is an error");
			
		}
			
		}
		
		public void addRecords(){
			
			x.format("%s%s%s", "20 ", "corey ", "zwart ");
					
		}		
		
		public void readFile() {
			
			while(get.hasNext()) {
				String a = get.next();			
				String b = get.next();
				String c = get.next();
				String d = get.next();
				
				System.out.printf("%s %s %s %s ", a, b, c, d);
			}
			
			
		}
		
		public void closeFile() {
			
			x.close();
					
		}
		
		
		
	}
	

