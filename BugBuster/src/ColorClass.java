
public class ColorClass {

	private int colorVar = 0;
    private static int R;
    private static int G;
    private static int B;
  	
	public void ChooseColor() {

		
		if(colorVar  == 0) {
			
			colorVar++;
			
			R = 51;
			G =	255;
			B =	51;		
						
	}
		else if(colorVar == 1) {
			
			colorVar++;

			R = 153;
			G =	51;
			B =	255;	
			
	}

		else if(colorVar == 2) {
			
			colorVar++;

			R = 255;
			G =	153;
			B =	51;
				
	}
		
		else if(colorVar == 3) {
			
			colorVar++;
			
			R = 0;
			G =	153;
			B =	153;
		
	}

		else if(colorVar == 4) {
			
			colorVar++;
			
			R = 229;
			G =	255;
			B =	204;			
					
	}
		
		else if(colorVar == 5) {
			
			colorVar++;
			
			R = 192;
			G = 192;
			B = 192;
						
	}
		
		else if(colorVar == 6) {
			
			colorVar = 0;
			
			R = 0;
			G = 204;
			B = 204;
						
	}
		
			
	}
	
		
	public static int getRvalue() {
			
		return R;
					
	}			
			
	public static int getGvalue() {
		
		return G;
			
	}
	
	public static int getBvalue() {
		
		return B;
		

	}	
	
	
	
	
	
	
	
	
}
