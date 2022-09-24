package br.com.aed.Desafios;

import java.util.ArrayList;

public class DesafioFibonnaci {
	/** classe � resposta ao desafio fibonacci */
	static int numAnterior;
	static int numAtual;
	static int numProximo;

	/*
	 * construa uma aplica��o que apresente a sequencia fibonnati ate o numero 50
	 */
	public static void main(String[] args) {

		int numAnterior;
		int numAtual;
		int numProximo = 0;
		/* determina at� onde nossa sequencia Fibonnaci vai */
		int fbSize = 50;

		// numAnterior+ numAtual = numProximo
		ArrayList<Integer> fb = new ArrayList<>();
		fb.add(0);
		fb.add(1);

		System.out.println(fb.toString());
		/*
		 * agora vamos adcionar a o restante da sequencia ao nosso arrayList, qual o
		 * proximo item?
		 */
		/*
		 * com um for vamos percorrer um arrayList e se a variavel i for maior que 0
		 * vamos somar o valor contido no i ndice correspondente da variavel i anterior
		 * ao valor da corres�pondente da variavel i atual e vamos adcionar o valor ao
		 * nosso ArrayList
		 */
		for (int i = 0; i < fb.size(); i++) {
			if (i > 0) {
				/*
				 * atribuimos o valor de i-1 a variavel numAnterior, e o valor de i a variavel
				 * numAtual
				 */
				numAnterior = fb.get(i - 1);
				numAtual = fb.get(i);
				/*
				 * realizamos a soma dos valores colhidos �para determinar o proximo da
				 * sequencia
				 */
				numProximo = numAnterior + numAtual;
				/* adcionamos o proximo numero a sequencia */
				fb.add(numProximo);

			}
			/*
			 * se nossa sequencia ultrapassar o limite especificado usamos um break e
			 * paramos o loop
			 */
			if (numProximo > fbSize) {

				break;
			}
		}
		/*
		 * quando saimos do loop entao apresentamos o valor contido dentro do nosso
		 * ArrayList
		 */
		System.out.println(fb.toString());

	}

}
