import java.util.Scanner;
public class MultipleClasses1 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		MultipleClasses2 MultiObj = new MultipleClasses2();
		
		System.out.println("Enter name of first girlfriend here: ");
		String temp = input.nextLine();
		MultiObj.setName(temp);
		MultiObj.saying();
		
		
	}

}
