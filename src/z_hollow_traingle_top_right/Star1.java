package z_hollow_traingle_top_right;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == j || i == 0 || j == 4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
