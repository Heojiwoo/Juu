package Jungol.repeatcontrol1;

import java.util.Scanner;

public class Evaluation5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double width = 0;
		while (true) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			width = (double)base * (double)height / 2;
			System.out.printf("Triangle width = %.1f\n", width);
			System.out.print("Continue? ");
			String s = sc.next();
			if (s.equals("Y") || s.equals("y")) {
			} else {
				break;
			}
		}

	}

}
