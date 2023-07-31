package operator;

import java.util.Scanner;

public class Self3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int a = i++;
		int b = ++i;
		
		System.out.println(a);
		System.out.println(b);
	}

}
