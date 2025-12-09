package z_hollow_triangle_bottom_right;

public class Alphabets1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char i = 'E'; i >= 'A'; i--) {
			for(char j = 'A'; j <= 'E'; j++) {
				if(i == j || i == 'A' || j == 'E') {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
