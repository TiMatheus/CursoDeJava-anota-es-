package DoisEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class QuartaAulaAtribuicaoCumulativa {

	public static void main(String[] args) {

		/* Uma operadora de telefonia cobra 50$ por blano que da direito a 100 minutos
		 * Cada minuto que passar de 100 custa 2 reais, fazer um programa pra ler a quantidade
		 * de minutos que a pessoa consumiu e mostrar o valor a ser pago
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("VALOR EM MINUTOS:");
		
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		
		
		
		
		sc.close();
	}

}
