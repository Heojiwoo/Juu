package repeatcontrol2;

import java.util.Scanner;

public class Evaluation5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		
		for (int i = 1; i <= 10; i++) {
			int n = sc.nextInt();
			if (n % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);

	}

}
