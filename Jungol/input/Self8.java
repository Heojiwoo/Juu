package Jungol.input;

import java.util.Scanner;

public class Self8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		String s = sc.next();

		System.out.printf("%.2f\n", d1);
		System.out.printf("%.2f\n", d2);
		System.out.printf("%s", s);
	}

}
