package br.com.aed.Estudoarray;

public class ArrayMultidimensional {
	/*
	 * voce pode criar arrays de quantas dimensoes desejar, comumente a maoria dos
	 * arrays chegam a no maximo duas dimensoes
	 */
	/* array de duas dimensoes */
	static String[][] nomes = { { "cachorro", "gato" }, { "toto", "xininho" } };

	public static void main(String[] args) {

		/* forma de acessar os elementos dentro de um array multidimensional */
		System.out.println("O " + nomes[0][1] + " se chama" + " " + nomes[1][0]);
		int teste = nomes.length;
		System.out.println(teste);
		/* cria-se um clone do outro array */
		String clonado[][] = nomes.clone();
		System.out.println(clonado[1][0]);

		/* percorrendo com o for */
		for (int i = 0; i < nomes.length; i++) {
			/* Imprime o valor na posi��o[i][0] */
			System.out.println(nomes[i][0]);
		}

		/* Finish class */
	}

}
