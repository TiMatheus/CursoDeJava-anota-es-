package TresEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiraAulaDebug {

	public static void main(String[] args) {

		/*
		 * DEBUG
		 * 
		 * marcar um breakpoint - RUN -> TOGGLE BREACKPOINT
		 * 
		 * iniciar o debug - BOTÃO DIREITO NA CLASSE -> DEBUG AS -> JAVA APPLICATION
		 * 
		 * executar uma linha - F6
		 * 
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();
	}

}
