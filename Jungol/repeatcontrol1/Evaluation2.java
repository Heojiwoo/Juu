package Jungol.repeatcontrol1;

import java.util.Scanner;

public class Evaluation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		
		while (true) {
			int i = sc.nextInt();
			if (i != 0) {
				if (i % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			} else {
				System.out.println("odd : " + odd);
				System.out.println("even : " + even);
				break;
			}
		}

	}

}
