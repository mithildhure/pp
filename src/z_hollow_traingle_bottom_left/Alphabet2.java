package z_hollow_traingle_bottom_left;

public class Alphabet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(char i = 'A'; i <= 'E'; i++) {
			for(char j = 'A'; j <= 'E'; j++) {
				if(i == j || i == 'E' || j == 'A') {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
