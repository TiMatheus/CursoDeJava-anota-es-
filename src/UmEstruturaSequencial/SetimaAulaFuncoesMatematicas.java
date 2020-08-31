package UmEstruturaSequencial;

public class SetimaAulaFuncoesMatematicas {

	public static void main(String[] args) {

		double A = 50;
		double x = 10;
		double y = 5;

		// A recebe raiz quadrada de x
		A = Math.sqrt(x);
		System.out.println(A);
		System.out.println("------");

		// A recebe o resultado de x elevado por y
		A = Math.pow(x, y);
		System.out.println(A);
		System.out.println("------");

		// A recebe o valor absoluto de x
		A = Math.abs(x);
		System.out.println(A);
		System.out.println("------");

	}

}
