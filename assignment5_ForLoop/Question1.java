package assignment5_ForLoop;

public class Question1 {

	public static void main(String[] args) {
		
		int i=0;
		
		for (i=0;i<=1000;i+=10) {
			
			if (i==1000) {
				
				System.out.println(i);
			}else {
				
				System.out.print(i+",");
			}
			
		}

	}

}
