package TresEstruturasRepetitivas;

import java.util.Scanner;

public class TerceiraAulaFor {

	public static void main(String[] args) {

		/*
		 * FOR "para"
		 * 
		 * repete os comandos para um certo intervalo de valores
		 * 
		 * usa quando sabe quantas vezes vai rodar os comandos
		 * 
		 * sintaxe
		 * for (inicio ; condição ; incremento) {
		 * comando 1
		 * comando 2
		 * }
		 * 
		 * Fazer um programa que lê um valor interiro N e depois N numeros
		 * inteiros. Ao final, mostra a soma dos numeros N
		 * 
		 */
		
		Scanner sc= new Scanner(System.in);
		
		//quantas vezes quer repitir
		int N = sc.nextInt();
		int soma = 0;
			
			//inicio    parada   incremento
		for (int i = 0 ; i < N ; i++ ) {
			int x = sc.nextInt();
			soma = soma + x;
			
		}
		
		System.out.println(soma);
		
		
		
		
		
		sc.close();
	}

}
