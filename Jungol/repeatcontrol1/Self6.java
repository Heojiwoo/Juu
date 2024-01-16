package Jungol.repeatcontrol1;

import java.util.Scanner;

public class Self6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stop = 0;
		
		while (true) {
		System.out.println("1. Korea");
		System.out.println("2. USA");
		System.out.println("3. Japan");
		System.out.println("4. China");
		System.out.print("number? ");
		
			int i = sc.nextInt();
			
			switch(i) {
			case 1 : {
				System.out.println("\nSeoul\n");
				break;
			}
			case 2 : {
				System.out.println("\nWashington\n");
				break;
			}
			case 3 : {
				System.out.println("\nTokyo\n");
				break;
			}
			case 4 : {
				System.out.println("\nBeijing\n");
				break;
			}
			default : 
				System.out.println("\nnone\n");
				stop = 1;
				break;
			}
			if (stop == 1) 
				break;
		}
		sc.close();

	}

}
