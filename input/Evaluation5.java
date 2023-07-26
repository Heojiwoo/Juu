package input;

import java.util.Scanner;

public class Evaluation5 {

	public static void main(String[] args) {
		System.out.print("yard? ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		double yard = 91.44;
		
		System.out.printf("%.1fyard = %.1fcm", a, (a*yard));

	}

}
