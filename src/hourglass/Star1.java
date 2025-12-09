package hourglass;

public class Star1 {

	public static void main(String[] args) {
		
		for(int i = 5; i >= 1; i--) {
			for(int j = i; j <= 5; j++ ) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 4; i++) {
			for(int j = i; j <= 4; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
