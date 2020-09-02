package QuatroOutrosTopicosEmJava;

import java.util.Scanner;

public class QuartaAulaFuncoesSintaxe {

	public static void main(String[] args) {

		/*
		 * Fun��es 
		 * 
		 * representata um processamento que sai um resultado
		 * 
		 * principais vantagens, modulariza��o, delega��o e reaproveitamento
		 * 
		 * podem receber dados de entradas (parametros e argumentos)
		 * podem ou n�o retornar uma sa�da
		 * 
		 * em orienta��o a objetos fun��es em classes recebe o nome de "m�todos"
		 * 
		 * EXERCICIO
		 * Fazer um programa pra ler o maior numero de 3, e crie uma fun��o
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite 3 numeros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//usando a fun��o
		int maior = maior(a, b ,c);
		//usando a fun��o
		mostrarMaior(maior);
		
		sc.close();
	}

	//fun��o
	
// public - pode usar em outras classes
// static - pode ser chamada idependente se e objeto	
// int - retorna o numero inteiro	
// maior- nome da fun��o	
	public static int maior(int a, int b, int c) {
		int aux;
		
		if(a > b && a > c) {
			aux = a;
		}
		
		else if (b > c ) {
			aux = b;
		}
		
		else {
			aux = c;
		}
		
	return aux; 
		
	}
	
	//fun��o
	// public - pode usar em outras classes
	// static - pode ser chamada idependente se e objeto	
	// void - retorna vazio
	// mostrarMaior- nome da fun��o	
	public static void mostrarMaior(int value) {
		System.out.println("Higher = " + value);
	}
}
