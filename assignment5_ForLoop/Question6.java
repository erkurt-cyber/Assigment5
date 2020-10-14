package assignment5_ForLoop;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("What is the term number?");
		int n = scan.nextInt();
		
		int n1=0,n2=1;
		int sum;
		
		for (int i=2;i<=n;i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;			
		}
		
		System.out.println("The last number is :"+n2);
		

	}

}
