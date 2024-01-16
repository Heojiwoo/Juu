package Jungol.repeatcontrol2;

import java.util.Scanner;

public class Self5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt3 = 0;
		int cnt5 = 0;
		
		for (int i = 1; i <= 10; i++) {
			int a = sc.nextInt();
			if (a % 3 == 0) {
				cnt3++;
			}
			if (a % 5 == 0) {
				cnt5++;
			}
		}
		System.out.println("Multiples of 3 : " + cnt3);
		System.out.println("Multiples of 5 : " + cnt5);
	}

}
