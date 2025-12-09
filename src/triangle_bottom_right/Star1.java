package triangle_bottom_right;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 4; i >= 0; i--) {
			for(int j = 0; j < 5;j++) {
				if(j>=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
