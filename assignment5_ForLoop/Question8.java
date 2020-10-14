package assignment5_ForLoop;

public class Question8 {

	public static void main(String[] args) {
		
		int n1 = 1, n2 = 2;
		int sum = 0;
		
		 while (n2<=5) { // The user can change the upper bound
			 sum = n1 + n2;
			 n1 = sum;
			 n2++;
			 		 
		 }
		System.out.println(sum); 
	}

}
