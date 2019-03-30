import java.util.Random;


public class MathPractice {

    public static int randMath;
    
    public void MathPractice() {
     
        MathMethods mathObj = new MathMethods();        
        Random mathRand = new Random();
        randMath = 0;
        
        while(randMath == 0){
        
        randMath = 1 + mathRand.nextInt(4);
        
        switch (randMath){
            
            case 1: 
                mathObj.Addition();
                randMath = 0;
            break;
            
            case 2: 
                mathObj.Subtraction();
                randMath = 0;
            break;
            
            case 3: 
                mathObj.Multiplication();
                randMath = 0;
            break;
            
            case 4: 
                mathObj.Division();
                randMath = 0;
            break;
            
            
            
        }    
            
        }
        
        
       
        
    }  
    }
    

