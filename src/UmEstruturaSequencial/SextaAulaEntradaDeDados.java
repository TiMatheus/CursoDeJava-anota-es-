package UmEstruturaSequencial;

import java.util.Scanner;

public class SextaAulaEntradaDeDados {
	
	public static void main(String[] args) {
		
		//Receber Dados do teclado
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE ALGO: ");
		
		//declaração String, int, double
		String x = sc.next();
		System.out.println("voce digitou: " + x);
		
		int a = sc.nextInt();
		System.out.println("voce digitou: " + a);
		
		Double b = sc.nextDouble();
		System.out.println("voce digitou: " + b);

		//fachar teclado
		sc.close();
		
		
		
		
		
	}
}

