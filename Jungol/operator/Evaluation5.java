package Jungol.operator;

import java.util.Scanner;

public class Evaluation5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ah = sc.nextInt();
		int aw = sc.nextInt();
		int bh = sc.nextInt();
		int bw = sc.nextInt();
		
		if (ah>bh && aw>bw) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}
