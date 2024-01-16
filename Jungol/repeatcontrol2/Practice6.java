package Jungol.repeatcontrol2;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		
		for (int i = 1; i <= 5; i++) {
			int score = sc.nextInt();
			sum += score;
		}
		
		avg = (double)sum / 5;
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.1f", avg);
	}

}
