package assignment5_ForLoop;

public class Question9 {

	public static void main(String[] args) {
		
		int i = 1;
		int end = 11;
		
		while (i<=end) {
			
			if ( i%2!=0 && i==(end-1)||i==end ) {
				System.out.print(i);
				
			}else if (i%2!=0) {
				System.out.print(i+",");
	
			}
				
			i++;
		}

	}

}
