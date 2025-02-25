package LeetCode_Med;

import java.util.Scanner;

public class Using_Enum {

	enum days{
		sunday,monday,tuesday,wednesday,thursday,friday,saturday
	}
	
	
	public static void main(String[]args ) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number 1 to 7");
		
		int dayvalue=sc.nextInt();
		
		System.out.println("The day "+ dayvalue + " is "+ days.values()[dayvalue-1]);
		sc.close();
	}
}
