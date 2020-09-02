package QuatroOutrosTopicosEmJava;

import java.util.Scanner;

public class QuartaAulaFuncoesSintaxe {

	public static void main(String[] args) {

		/*
		 * Funções 
		 * 
		 * representata um processamento que sai um resultado
		 * 
		 * principais vantagens, modularização, delegação e reaproveitamento
		 * 
		 * podem receber dados de entradas (parametros e argumentos)
		 * podem ou não retornar uma saída
		 * 
		 * em orientação a objetos funções em classes recebe o nome de "métodos"
		 * 
		 * EXERCICIO
		 * Fazer um programa pra ler o maior numero de 3, e crie uma função
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite 3 numeros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//usando a função
		int maior = maior(a, b ,c);
		//usando a função
		mostrarMaior(maior);
		
		sc.close();
	}

	//função
	
// public - pode usar em outras classes
// static - pode ser chamada idependente se e objeto	
// int - retorna o numero inteiro	
// maior- nome da função	
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
	
	//função
	// public - pode usar em outras classes
	// static - pode ser chamada idependente se e objeto	
	// void - retorna vazio
	// mostrarMaior- nome da função	
	public static void mostrarMaior(int value) {
		System.out.println("Higher = " + value);
	}
}
