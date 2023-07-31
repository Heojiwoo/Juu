package operator;

import java.util.Scanner;

public class Self5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean T = (a == b);
		boolean F = (a != b);
		
		System.out.println(T);
		System.out.println(F);
	}
}
