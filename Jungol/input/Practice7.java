package Jungol.input;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		System.out.print("두 수를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " * " + b + " = " + (a*b));

	}

}
