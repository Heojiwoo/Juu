package Jungol.operator;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		System.out.print("5개의 수를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		System.out.print(a + 3 + " ");
		System.out.print(b - 3 + " ");
		System.out.print(c * 3 + " ");
		System.out.print(d / 3 + " ");
		System.out.print(e % 3);
		
	}

}
