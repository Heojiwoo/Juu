package Jungol.repeatcontrol1;

import java.util.Scanner;

public class Self4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		
		while (true) {
			int i = sc.nextInt();
			cnt++;
			sum += i;
			if(i >= 100) 
				break;
		}
		System.out.println(sum);	
		avg = (double)sum / cnt;
		System.out.printf("%.1f", avg);

	}

}
