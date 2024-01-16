package Jungol.operator;

import java.util.Scanner;

public class Self6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean i = a > b;
		boolean i2 = a < b;
		boolean i3 = a >= b;
		boolean i4 = a <= b;
		
		System.out.println(a + " > " + b + " --- " + i);
		System.out.println(a + " < " + b + " --- " + i2);
		System.out.println(a + " >= " + b + " --- " + i3);
		System.out.println(a + " <= " + b + " --- " + i4);

	}

}
