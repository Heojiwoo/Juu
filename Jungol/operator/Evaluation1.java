package Jungol.operator;

import java.util.Scanner;

public class Evaluation1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int computer = sc.nextInt();
		
		System.out.println("sum " + (kor+eng+math+computer));
		System.out.println("avg " + (kor+eng+math+computer)/4);
	}

}
