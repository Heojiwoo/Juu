package operator;

import java.util.Scanner;

public class Self1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("sum : " + (a+b+c));
		System.out.println("avg : " + ((a+b+c)/3));
	}

}
