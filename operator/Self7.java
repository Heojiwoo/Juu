package operator;

import java.util.Scanner;

public class Self7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean a1 = (a != 0) && (b != 0);
		boolean b1 = (a != 0) || (b != 0);
		
		System.out.println(a1 + " " + b1);
	}

}
