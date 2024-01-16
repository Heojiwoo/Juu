package Jungol.repeatcontrol1;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		
		while (true) {
			int i = sc.nextInt();
			if (i != 0) {
				if (i % 2 == 1) {
					cnt++;
					sum += i;
				}	
			} else {
				System.out.println("홀수의 합 = " + sum);
				System.out.println("홀수의 평균 = " + sum / cnt);
				break;
			}
		}
		

	}

}
