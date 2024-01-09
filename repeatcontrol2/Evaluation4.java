package repeatcontrol2;

import java.util.Scanner;

public class Evaluation4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		double avg = 0;
		
		if (n <= 100) {
			for (int i = 1; i <= n; i++) {
				int score = sc.nextInt();
				sum += score;
			}
			avg = (double)sum / (double)n;
			System.out.printf("%.2f", avg);
		}

	}

}
