package DoisEstruturaCondicional;

import java.util.Scanner;

public class SextaAulaCondiçãoTenaria {

	public static void main(String[] args) {

		/*
		 * Estrutura opcional ao if else quando se deseja decidir um VALO com base em
		 * uma condição
		 * 
		 * sintaxe:
		 * (condição) ? valor_se_verdadeiro : valor_se_falso
		 */
		
			
		/*
		 * se o preço do produto for menor que 20$ de desconto de 0.1.
		 * se for maior de 0.05
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço");
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		double precofinal = preco - desconto;
		
		System.out.println("preço final é : " + precofinal);
		System.out.println("deconto foi de : " + desconto);
				
				
				
				
		sc.close();

	}
	
	
	

}
