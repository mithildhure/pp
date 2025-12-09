package z_hollow_triangle_top_left;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 5;i >= 1; i--) {
			for(int j = 1; j <= 5; j++) {
				if(i == j || i == 5 || j == 1) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
