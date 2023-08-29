package repeatcontrol2;

import java.util.Scanner;

public class Evaluation6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		
		if (a < b) {
			for (int i = a; i <= b; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
					cnt++;
				}
			} 
		} else {
			for (int j = b; j <= a; j++) {
				if (j % 3 == 0 || j % 5 == 0) {
					sum += j;
					cnt++;
				}
			}
		}
		avg = (double)sum / cnt;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}

}
