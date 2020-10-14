package assignment5_ForLoop;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int value = 0;
		while (value<100) {
			
		System.out.println("Enter a number : ");
		
		int num = scan.nextInt();	
		
		value = num * 10;
		
		System.out.println("The value is : "+value);
		
		}
		
		System.out.println("Finish!");
		

	}

}
