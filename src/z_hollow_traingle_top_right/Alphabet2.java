package z_hollow_traingle_top_right;

public class Alphabet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(char i = 'A'; i <= 'E'; i++) {
			for(char j = 'A'; j <= 'E'; j++) {
				if(i == j || i == 'A' || j == 'E') {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
