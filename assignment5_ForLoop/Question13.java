package assignment5_ForLoop;

public class Question13 {

	public static void main(String[] args) {
		
		char let1 = 'w';
		char let2 = 'B';
		
		for (int row=1;row<=8;row++) {
			
			if (row%2!=0) {
				
				for (int col=1;col<=8;col++) {	
				
					if (col%2!=0){
						
						System.out.print(let1);
					}else {
						System.out.print(let2);
					}			
				} 
				
			}else {
				
				for (int col=1;col<=8;col++) {	
					
					if (col%2!=0){
						
						System.out.print(let2);
					}else {
						System.out.print(let1);
					}		
				} 		
			}	
			System.out.println();
		}

	}

}
