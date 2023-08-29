package repeatcontrol1;

import java.util.Scanner;

public class Self5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int i = sc.nextInt();
			if (i % 3 == 0) {
				System.out.println(i / 3);
			} else {
			}
			if (i == -1)
				break;
		}

	}

}
