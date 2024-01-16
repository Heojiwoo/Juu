package Jungol.repeatcontrol2;

import java.util.Scanner;

public class Self6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		double avg = 0;
		
		if (n <= 10) {
			for (int i = 1; i <= n; i++) {
				int score = sc.nextInt();
				sum += score;
		}
			avg = (double)sum / n;
			System.out.printf("avg : %.1f\n", avg);
			
			if (avg >= 80) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}
		}
		
	}

}
