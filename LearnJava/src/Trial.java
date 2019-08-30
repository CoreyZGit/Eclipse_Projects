import java.util.Scanner;

public class Trial {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Who was the first president of the United States?");
		String answer = "George Washington";
		String guess = input.nextLine();
		
		boolean response;
		response = guess.equals(answer);
		
		if (response == true) {
			System.out.println("Correct!");
		}else {
			System.out.println("Wrong!");
		}
		}
    }	
		
	

	

		
		
		
		
		
		
		
		
		
		
		
		
			
	
	

