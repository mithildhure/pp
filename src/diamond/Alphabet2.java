package diamond;

public class Alphabet2 {

	public static void main(String[] args) {

		for(char i = 'E'; i >= 'A'; i--) {
			for(char j = 'A'; j <= 'E'; j++) {
				if(j >= i) {
					System.out.print(i+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(char i = 'B'; i <= 'E'; i++) {
			for(char j = 'A'; j <= 'E'; j++) {
				if(j>=i) {
					System.out.print(i+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
