package LeetCode_Med;

import java.util.Scanner;

public class Avg_Weight {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] weights = new int[10];
		int sum=0;
		for(int i=0;i<weights.length;i++) {
			
			System.out.println("enter the weight of person "+(i+1));
			
			weights[i]=sc.nextInt();
			sum +=weights[i];
		}
		double avg=sum/10.0;
		
		System.out.println("Avg of Weights ");
		for(int weight: weights) {
			
			System.out.print(weight+" ");
		}
		
		System.out.println();
		System.out.println("is "+avg);
		
	}
}
