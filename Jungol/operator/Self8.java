package Jungol.operator;

import java.util.Scanner;

public class Self8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		boolean boo1 = (a>b) && (a>c);
		// boolean boo2 = !((a>b) && (a>c));
		boolean boo3 = (a==b) && (a==c) && (b==c);
		// boolean boo4 = !((a==b) && (a==c) && (b==c));
		
		System.out.println(boo1 + " " + boo3);
	}

	
}
