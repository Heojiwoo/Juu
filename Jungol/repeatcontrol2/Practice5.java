package Jungol.repeatcontrol2;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		for (int i = 1; i <= 10; i++) {
			int n = sc.nextInt();
			
			if (n % 2 == 0) {
				cnt++;
			}
		}
		System.out.printf("입력받은 짝수는 %d개입니다.", cnt);
	}
}
