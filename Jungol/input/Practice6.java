package Jungol.input;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		System.out.print("당신의 나이는 몇 살입니까? ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		System.out.println("당신의 나이는 " + age + "살이군요.");
	}
}
