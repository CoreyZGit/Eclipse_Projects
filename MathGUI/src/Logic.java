import java.util.Random;


public class Logic {
	
	int[] arrayNum = new int[3];
	Random rand = new Random();
	private String mathQuestion;
	private int compVar;
	
	public int[] questionValues(int firstnum, int secondnum, int answer ){
		
		int randMath = 1 + rand.nextInt(4);
		
		switch(randMath) {
		
		
		
		
		
		case 1: 
			
		firstnum = 1 + rand.nextInt(100);
		secondnum = 1 + rand.nextInt(100);   
		answer = firstnum + secondnum;	
				
		break;	
		
		
		
		
		
		case 2:
			
		firstnum = 1 + rand.nextInt(100);
		secondnum = 1 + rand.nextInt(100);   
					
		while(firstnum < secondnum) {
		
		firstnum = 1 + rand.nextInt(100);
		secondnum = 1 + rand.nextInt(100);
						
		}
		
		answer = firstnum - secondnum;
				
		break;
		
		
		
		
		
		case 3:
			
		firstnum = 1 + rand.nextInt(12);
		secondnum = 1 + rand.nextInt(12);   
		answer = firstnum * secondnum;	
			
			
		break;
		
		
		
		
		
		case 4:	
			
		firstnum = 1 + rand.nextInt(144);
		secondnum = 1 + rand.nextInt(12);   
		answer = firstnum % secondnum;
		
		while((answer != 0)||(firstnum < secondnum)){
			    
		firstnum = 1 + rand.nextInt(144);
		secondnum = 1 + rand.nextInt(12);   
		answer = firstnum % secondnum;
			         
			    }
			    
		answer = firstnum / secondnum;	
		
		
		}
		
		
		
		
		
		arrayNum[0] = firstnum;
		arrayNum[1] = secondnum;
		arrayNum[2] = answer;
		
		return arrayNum;
		
		
		
		
		
	}
		
	public String question(int[] questionArray) {
		
		if(questionArray[0] > questionArray[1] && questionArray[0] > questionArray[2]) {
			
			compVar = questionArray[0] - questionArray[1];
			
			if(compVar == questionArray[2] ) {
				
				mathQuestion = String.format("What is the difference of %d - %d ?", questionArray[0], questionArray[1]);			
				
			}else {
				
				mathQuestion = String.format("What is the quotient of %d / %d ?", questionArray[0], questionArray[1]);				
			
			}
			
			}else {
			
			compVar = questionArray[0] + questionArray[1];
			
			if(compVar == questionArray[2]) {
				
				mathQuestion = String.format("What is the sum of %d + %d ?", questionArray[0], questionArray[1]);
				
			}else {
				
				mathQuestion = String.format("What is the product of %d x %d ?", questionArray[0], questionArray[1]);
				
			}
		}
				
		return mathQuestion;
	}
		
		
		
		
		
	}
	
	
	
	


