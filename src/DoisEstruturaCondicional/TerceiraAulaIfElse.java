package DoisEstruturaCondicional;

import java.util.Scanner;

public class TerceiraAulaIfElse {

	public static void main(String[] args) {

		/*
		 * IF ELSE
		 * 
		 */
		
		System.out.println("Digite um 1");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		if (num1 == 1) {
			System.out.println("PARABENS, VOCÊ DIGITOU 1");
		}
		
		else {
			System.out.println("DIGITE UM 1");
			
		}
				
		sc.close();
	}

}
