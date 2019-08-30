import java.util.Scanner;
public class Trial2 {
	public static void main(String args[]) {
		
		System.out.println("What is your name good sir?");
		
		Scanner input = new Scanner(System.in);
		String Name = input.nextLine();
		
		System.out.println("Choose a number 1 through 5.");
		
		int choice = input.nextInt();
		
		if (choice == 1) {
			System.out.println(Name + " is an asshole!");
			}
		else if (choice == 2) {
			System.out.println(Name + " is a douche canoe!");
			}
		else if (choice == 3) {
			System.out.println(Name + " is a nice person!");
			}
		else if (choice == 4) {
			System.out.println(Name + " is a pussy fart!");
			}
		else if (choice == 5) {
			System.out.println(Name + " is a caca face!");
			}
		else {
			System.out.println(Name + " is a fuck head!");
			}
		}
		
	}	