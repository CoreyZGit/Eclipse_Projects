import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		
		System.out.println("Please enter your name.");
		
		Scanner testtaker = new Scanner(System.in);
		String name = testtaker.nextLine();
		
		System.out.println("Hello " + name + ", Welcome to my test.\n"
				         + "It is comprised of ten multiple choice questions.\n"
				         + "You may press enter when you are ready. Don't mess up!");
			
		testtaker.nextLine();
	   	
		String q1 = "What is the chemical formula for Glucose?\n"
				  + "(a)C21H30O2\n(b)C6H12O6\n(c)CO2\n(d)NH3\n";
	
		String q2 = "Who was the fourth president of the USA?\n"
				  + "(a)James Monroe\n(b)Andrew Jackson\n(c)James Madison\n(d)Thomas Jefferson\n";
		
		String q3 = "For what shape does this equation calculate area? A = ½ Base x Height\n"
				  + "(a)Circle\n(b)Rectangle\n(c)Trapezoid\n(d)Triangle\n";
		
		String q4 = "Which of these Kingdoms contain unicellular organisms.\n"
				  + "(a)Fungi\n(b)Plant\n(c)Mammal\n(d)All of the above.\n";
		
		String q5 = "Which of these poets lived during the Transcendentalist Movement?\n"
				  + "(a)Edgar Allen Poe\n(b)Ralph Waldo Emerson\n(c)Mary Shelley\n(d)Nathaniel Hawthorne\n";
		
		String q6 = "What Empire was the precursor for the Byzantine Empire?\n"
				  + "(a)Eastern Roman Empire\n(b)Persian Empire\n(c)The Quin Dynasty\n(d)The Western Roman Empire\n";
		
		String q7 = "What force is due to the repulsive interaction between atoms at close contact.\n"
				  + "(a)Elastic Force\n(b)Normal Force\n(c)Centripetal Force\n(d)Tension\n";
		
		String q8 = "In western music, how many semitones define a tritone?\n"
				  + "(a)4\n(b)5\n(c)6\n(d)8\n";
				
		String q9 = "In greek mythology, what war did the Illiad and Odyessey depict?\n"
				  + "(a)Trojan War\n(b)Balkan War\n(c)Gallic War\n(d)Punic War\n";
		
		String q10 = "Which mineral classification contains rock formed from magma?\n"
				  + "(a)Andesite\n(b)Metamorphic\n(c)Sedimentary\n(d)Igneous\n";
			
		
				Question [] questions = {
				new Question(q1, "b"),
				new Question(q2, "c"),
				new Question(q3, "d"),
				new Question(q4, "b"),
				new Question(q5, "b"),
				new Question(q6, "a"),
				new Question(q7, "b"),
				new Question(q8, "c"),
				new Question(q9, "a"),
				new Question(q10,"d"),
				
				};
				
		takeTest(questions);
	}
	
public static void takeTest(Question [] questions) {	
	
		int score = 0;
		Scanner userinput = new Scanner(System.in);
		
		for(int i = 0; i < questions.length; i++) {
		System.out.println(questions[i].prompt);
		String answer = userinput.nextLine();
		if(answer.equals(questions[i].answer)) {
			score++;
	}
  }
		System.out.println("You got " + score + "/" + questions.length);
		
		switch(score) {
		
		case 0:
			System.out.println("I award you no points and may god have mercy on your soul!");
			break;
		case 1:
			System.out.println("Pre-school level.");
			break;
		case 2:
			System.out.println("About half a brain.");
			break;
		case 3:
			System.out.println("Stay in school.");
			break;
		case 4:
			System.out.println("Ehh, not the brightest.");
			break;
		case 5:
			System.out.println("Slightly below average.");
			break;
		case 6:
			System.out.println("Just average.");
			break;
		case 7:
			System.out.println("Could be worse.");
			break;
		case 8:
			System.out.println("Not too shabby.");
			break;
		case 9:
			System.out.println("Okay you're pretty smart.");
			break;
		case 10:
			System.out.println("Genius level!");
			break;	
		}
  } 
}


