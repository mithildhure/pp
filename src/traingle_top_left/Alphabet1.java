package traingle_top_left;

public class Alphabet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(char i = 'E'; i >= 'A'; i--) {
			for(char j = 'A'; j <='E'; j++) {
				if(i >= j) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		
	}

}
