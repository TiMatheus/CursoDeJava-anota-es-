package QuatroOutrosTopicosEmJava;

public class TerceiraAulaFuncoesStrings {

	public static void main(String[] args) {

		String original = "abcd ABCDD SSS asass bcAS";

		// transformar em letras minusculas
		String s01 = original.toLowerCase();
		System.out.println(s01);
		System.out.println("-------------------------------");

		// transformar em maiusculas
		String s02 = original.toUpperCase();
		System.out.println(s02);
		System.out.println("-------------------------------");

		// elimina os espaços em branco
		String s03 = original.trim();
		System.out.println(s03);
		System.out.println("-------------------------------");

		// pega a posição que escolhe e mostra so apartir do que escolheu "2"
		String s04 = original.substring(2);
		System.out.println(s04);
		System.out.println("-------------------------------");

		// pega a posição que escolhe e mostra so apartir do que escolheu "2", e recorta
		// aonde selecionado "9"
		String s05 = original.substring(2, 9);
		System.out.println(s05);
		System.out.println("-------------------------------");

		// troca uma letra por outra "troca o a, por x"
		String s06 = original.replace('a', 'x');
		System.out.println(s06);
		System.out.println("-------------------------------");

		// mostra em qual posição esta a 1 ocorrencia do "bc"
		int i = original.indexOf("bc");
		System.out.println(i);
		System.out.println("-------------------------------");

		// mostra em qual posição esta a ultima ocorrencia do "bc"
		int j = original.lastIndexOf("bc");
		System.out.println(j);
		System.out.println("-------------------------------");

	}

}
