package DoisEstruturaCondicional;

import java.util.Scanner;

public class SextaAulaCondi��oTenaria {

	public static void main(String[] args) {

		/*
		 * Estrutura opcional ao if else quando se deseja decidir um VALO com base em
		 * uma condi��o
		 * 
		 * sintaxe:
		 * (condi��o) ? valor_se_verdadeiro : valor_se_falso
		 */
		
			
		/*
		 * se o pre�o do produto for menor que 20$ de desconto de 0.1.
		 * se for maior de 0.05
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o pre�o");
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		double precofinal = preco - desconto;
		
		System.out.println("pre�o final � : " + precofinal);
		System.out.println("deconto foi de : " + desconto);
				
				
				
				
		sc.close();

	}
	
	
	

}
