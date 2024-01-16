package Jungol.input;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		System.out.println("두 개의 실수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		
		System.out.printf("x = %.2f\n", d1);
		System.out.printf("y = %.2f", d2);
	}

}
