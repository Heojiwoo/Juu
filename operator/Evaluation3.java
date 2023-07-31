package operator;

import java.util.Scanner;

public class Evaluation3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int width = sc.nextInt();
		int length = sc.nextInt();
		
		int a = width + 5;
		int b = length * 2;
		
		System.out.println("width = " + a);
		System.out.println("length = " + b);
		System.out.println("area = " + (a*b));
	}

}
