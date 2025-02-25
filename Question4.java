package LeetCode_Med;

import java.util.Scanner;

public class Swap_Function {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Before Swap num1= "+num1 +" num2= " + num2);
		
		num1 += num2;
		num2 =num1-num2;
		num1 = num1-num2;
		
		
		System.out.println("After Swap num1= "+num1 +" num2= " + num2);
		sc.close();
	}
	
	

}
