package operator;

import java.util.Scanner;

public class Evaluation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + " / " + b + " = " + (a/b) + "..." + (a%b));

	}

}
