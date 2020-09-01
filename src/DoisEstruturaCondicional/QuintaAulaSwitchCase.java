package DoisEstruturaCondicional;

import java.util.Scanner;

public class QuintaAulaSwitchCase {

	public static void main(String[] args) {

		/*
		 * Switch-case
		 * 
		 * é usada quando tem varias opçoes de fluxo a ser tradada com uma variavel
		 */

		/*
		 * fazer um programa pra ler os dias da semana 1 a 7 1 domingo, 2 segunda, ...
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("QUE DIA DA SEMANA É, DE 1-7");

		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;// é obrigado a usar essa palavra no final de cada caso
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:// caso as opçoes falhem, faça isso
			dia = "valor invalido";
		}

		System.out.println("Dia da semana: " + dia);

		sc.close();

	}

}
