import java.util.Scanner;
import java.util.Random;

public class MathMethods {
    
  
 private int firstnum;
    private int secondnum;
    private int input;
    private int answer;
    Scanner addScan = new Scanner(System.in);
    Random addRand = new Random();
       
    
    public void Addition(){       
    
    firstnum = 1 + addRand.nextInt(100);
    secondnum = 1 + addRand.nextInt(100);   
    answer = firstnum + secondnum;
    
    System.out.printf("What is the sum of %d + %d ?", firstnum, secondnum);
   
    input = addScan.nextInt();
    
    if (input == answer){
        
        System.out.println("Correct!"); 
        
        
    }else{
        
       System.out.println("Wrong!");  
        
    }
    
  }

public void Subtraction(){       
    
    firstnum = 1 + addRand.nextInt(100);
    secondnum = 1 + addRand.nextInt(100);   
    answer = firstnum - secondnum;
    
    System.out.printf("What is the difference of %d - %d ?", firstnum, secondnum);
   
    input = addScan.nextInt();
    
    if (input == answer){
        
        System.out.println("Correct!"); 
        
        
    }else{
        
       System.out.println("Wrong!");      
    
}
}

public void Multiplication(){       
    
    firstnum = 1 + addRand.nextInt(12);
    secondnum = 1 + addRand.nextInt(12);   
    answer = firstnum * secondnum;
    
    System.out.printf("What is the product of %d x %d ?", firstnum, secondnum);
   
    input = addScan.nextInt();
    
    if (input == answer){
        
        System.out.println("Correct!"); 
        
        
    }else{
        
        System.out.println("Wrong!");      


}
}  



 public void Division(){              
        
    firstnum = 1 + addRand.nextInt(144);
    secondnum = 1 + addRand.nextInt(12);   
    answer = firstnum % secondnum;
    
    while((answer != 0)||(firstnum < secondnum)){
    
    firstnum = 1 + addRand.nextInt(144);
    secondnum = 1 + addRand.nextInt(12);   
    answer = firstnum % secondnum;
         
    }
    
    answer = firstnum / secondnum;    
    
    System.out.printf("What is the qoutient of %d / %d ?", firstnum, secondnum);
   
    input = addScan.nextInt();
    
    if (input == answer){
        
        System.out.println("Correct!"); 
        
        
    }else{
        
        System.out.println("Wrong!");         
    
    
    
    
}       
}
}
