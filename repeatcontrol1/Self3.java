package repeatcontrol1;

import java.util.Scanner;

public class Self3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("number? ");
			int a = sc.nextInt();
			if (a > 0) {
				System.out.println("positive integer");				
			} else if (a < 0) {
				System.out.println("negative number");				
			} else {
				break;				
			}
		}

	}

}
