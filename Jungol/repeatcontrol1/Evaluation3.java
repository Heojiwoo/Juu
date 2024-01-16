package Jungol.repeatcontrol1;

import java.util.Scanner;

public class Evaluation3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		while (true) {
			int i = sc.nextInt();
			
			if (i >= 0 && i <= 100) {
				cnt++;
				sum += i;
			} else {
				System.out.println("sum : " + sum);
				avg = (double)sum / cnt;
				System.out.printf("avg : %.1f", avg);
				break;
			}
		}
	}

}
