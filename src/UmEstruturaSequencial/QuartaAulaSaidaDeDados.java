package UmEstruturaSequencial;

import java.util.Locale;

public class QuartaAulaSaidaDeDados {

	public static void main(String[] args) {
		
		
		//PRINTLN - PULA LINHA
		System.out.println("Olá mundo !");
		
		System.out.println("-");
		
		//PRINT - SEM QUEBRA DE LINHA 
		System.out.print("Olá Mundo !!");
		
		System.out.println("");
		
		System.out.println("-");

		double a = 10.123456789;
		
		System.out.println(a);
		
		System.out.println("-");
		
		//PRINTF - DELIMITAR CASAS DECIMAIS
		System.out.printf("%.5f%n", a);
		
		System.out.println("-");
		
		//Pra usar "." em vez de ","
		Locale.setDefault(Locale.US);
		System.out.printf("%.5f%n", a);
		
		System.out.println("-");
		
		//Para concatenar varios elemento "+"
		System.out.println("O resultado é" + a);
		
		System.out.println("-");
				

	}

}
