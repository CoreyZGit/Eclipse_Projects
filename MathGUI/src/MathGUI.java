
public class MathGUI {
	
	public static int chosendiff = 0;
	public static int numerator;
	public static int addsum;
	public static int divmult;
		
	public static void main(String args[]) {
				
		SelectDifficulty SelObj = new SelectDifficulty();				
		chosendiff = SelObj.SelectDiff();	
		System.out.println(chosendiff);			
		
		switch(chosendiff) {
		
		case 1:
			
			addsum = 25;
			divmult = 7;
			numerator = 49;
			
		break;				
			
		case 2:
			
			addsum = 50;
			divmult = 12;
			numerator = 144;
		
		break;	
			
		case 3:
			
			addsum = 500;
			divmult = 24;
			numerator = 576;
			
		break;	
					
		}
		
		GUI guiObj = new GUI();
		
			
	}
}