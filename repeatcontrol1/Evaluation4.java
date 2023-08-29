package repeatcontrol1;

import java.util.Scanner;

public class Evaluation4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		while (true) {
			int i = sc.nextInt();
			if (i != 0) {
				if (i % 3 != 0 && i % 5 != 0) {
					cnt++;
				}
			} else  {
				System.out.println(cnt);
				break;
			}
		}

	}

}
