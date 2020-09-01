package TresEstruturasRepetitivas;

import java.util.Scanner;

public class SegundaAulaWhile {

	public static void main(String[] args) {

		/*
		 * WHILE "ENQUANTO"
		 * 
		 * repete os comandos enquanto o comando for verdadeiro
		 * 
		 * usa quando n�o se sabe quantas quantidades sera realizadas
		 * 
		 * Fazer um programa que l� numeros inteiros ate que um zero
		 * seja lido, ao final mostra a soma numeros lidos
		 * 
		 * sintaxe
		 * while ( condi��o ) { // se a condi��o for verdadeira, executa e volta
		 * comando 1				se for falsa, pula fora
		 * comando 2
		 * }
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
			
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			
			soma = soma + x;
			x = sc.nextInt();
			
		}
				
		System.out.println(soma);
				
		sc.close();
	}

}
