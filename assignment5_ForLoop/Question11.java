package assignment5_ForLoop;

public class Question11 {

	public static void main(String[] args) {
		
		int startNum = 4;
		
		for (int row=1;row<=4;row++) {
			
			switch (row) {
			case 2:
				System.out.print(" ");
				break;
			case 3:
				System.out.print("  ");
				break;
			case 4:
				System.out.print("   ");
				break;
			}
			
			for (int i=startNum;i>=1;i--) {
				
				System.out.print(i+" ");
				
			}
			startNum--;
			System.out.println();
			
		}
			
			

	}

}
