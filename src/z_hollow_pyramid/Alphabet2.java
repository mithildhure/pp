package z_hollow_pyramid;

public class Alphabet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(char i = 'E'; i >= 'A'; i--) {
			for(char j = 'A'; j <= 'E'; j++) {
				if(j >= i) {
					if(j == i || i == 'A' || j == 'E') {
						System.out.print(i+" ");
					}else {
						System.out.print("  ");
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
