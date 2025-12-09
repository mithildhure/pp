package z_hollow_square;

public class Alphabet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char i = 'A'; i <= 'E'; i++) {
			for(char j = 'A'; j <= 'E'; j++) {
				if(i == 'A' || i == 'E' || j == 'A' || j == 'E') {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
