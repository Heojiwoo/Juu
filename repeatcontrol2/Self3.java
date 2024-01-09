package repeatcontrol2;

import java.util.Scanner;

public class Self3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a <= 50) {
			for (int i = 1; i <= a; i++) {
				if (i % 2 == 0) 
					System.out.print(i + " ");					
				}
				
			}
		}

	}

