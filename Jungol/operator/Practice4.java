package Jungol.operator;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = (++a) + (b--);
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
	}

}
