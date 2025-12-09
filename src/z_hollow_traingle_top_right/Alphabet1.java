package z_hollow_traingle_top_right;

public class Alphabet1 {
	
	public static void main(String[] args) {
		
		for(char i = 'A'; i <= 'E'; i++) {
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
