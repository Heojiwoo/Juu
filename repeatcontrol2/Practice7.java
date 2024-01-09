package repeatcontrol2;

public class Practice7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
				System.out.printf("%d %d %d %d %d \n", i, i, i, i, i);
		}
		System.out.println();
		
		for (int m = 1; m <= 5; m++) {
			for (int n = 1; n <= 5; n++) {
				System.out.printf("%d ", n);
			}
			System.out.println();
		}

	}

}
