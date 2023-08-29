package repeatcontrol1;

import java.util.Scanner;

public class Self2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i <= a) {
			sum += i;
			i++;
		}
		System.out.println(sum);

	}

}
