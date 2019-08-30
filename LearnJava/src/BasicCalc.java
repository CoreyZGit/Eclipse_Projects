import java.util.Scanner;

public class BasicCalc {
	public static void main(String arg[]) {
		Scanner Calculate = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter frst num:  ");
		fnum = Calculate.nextDouble();
		System.out.println("Enter second num: ");
		snum = Calculate.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
		
		
}
}