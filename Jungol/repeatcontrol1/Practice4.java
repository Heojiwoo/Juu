package Jungol.repeatcontrol1;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		while (true) {
			int i = sc.nextInt();
			
			if (i != 0) {
				cnt++;
				sum += i;
			} else {
				System.out.println("입력된 자료의 개수 = " + cnt);
				System.out.println("입력된 자료의 합계 = " + sum);
				avg = (double)sum / cnt;
				System.out.printf("입력된 자료의 평균 = %.2f", avg);
				break;
			}
		}

	}

}
