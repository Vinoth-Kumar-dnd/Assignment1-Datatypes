package LeetCode_Med;
import java.util.Scanner;
public class Type_Conversion {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Float number");
		
		float num = sc.nextFloat();
		
		int result = (int) num;
		
		System.out.println("Enter a double number");
		
		double num1 = sc.nextFloat();	
		
		float result2= (float) num1;
		
		short result3 = (short) result;
		
		System.out.println(num+" float to int " + result);
		System.out.println(num1+" double to float " + result2);
		System.out.println(result+" int to short " + result3);
		sc.close();
		
	}
}
