package br.com.aed.Logica;

import java.util.ArrayList;

public class LoopFor {
	/** classe se destina e exemplificar o loop de repeti��o for */
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		/*
		 * oque � o for, o for � um velho conhecido de outras linguagens, ele analiza
		 * uma condi��o e enquanto aquela condi��o nao for satisfeita ele realiza alguma
		 * fun��o
		 */
		/*
		 * como se constroi um for declaramos a palavra chave for(int i = 0;i<5;i++),
		 * inicializamos uma variavel i, impomos uma condi��o no caso enquanto i for
		 * maior que 5, e incrementamos ou decrementamos a variavel, veja este loop
		 * funcionando abaixo
		 */
		for (int i = 0; i < 5; i++) {
			/*
			 * aqui dentro vamos realizar qualquer coisa que desejarmos, at� que a variavel
			 * i seja igual ou maior que cinco
			 */
			System.out.print(i);
		}

		/*
		 * vamos inicializar outro for porem desta vez vamos decrementar seu valor
		 */

		for (int i = 0; i > -6; i--) {
			System.out.println(" " + i);
		}
		/* a variavel criada dentro do for s� pode ser usada dentro do for */
		/* podemos percorrer os itens de um array ultilizando o for */

		/* vamos criar um array */
		String nomes[] = { "oscar", "sara", "aika", "nicole" };

		/* vamos percorrer o Arrauy e mostrar cada um dos nomes do Array */
		for (int i = 0; i < nomes.length; i++) {
			/* vamos imprimir nomes na posi��o[i] */
			System.out.println(nomes[i]);
		}
		/*
		 * cuidado com loops infinitos apesar de nao causar dados no pc eles podem
		 * travar o computador
		 */
		/*
		 * essa linha abaixo gera um for infinito que vai rodar at� voce desligar o pc
		 */
		/**
		 * for(int i = 0;i>=0;i++){ System.out.println(i); }
		 */

		/* for each, � um tipo de for mais especifico para �percorrer arrays */
		int[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		/*
		 * percorrendo com o for each
		 */
		for (int valor : numeros) {
			System.out.println(numeros[valor]);
		}

		/*
		 * podemos usar o for para adcionar uma serie de elementos dentro de um
		 * ArrayList
		 */
		ArrayList<Integer> number = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			/*
			 * toda vez que o for passar por aqui vai adcionar o valor atual da variavel i
			 * dentro do for
			 */
			number.add(i);
		}
		System.out.println(number.toString());
		System.out.println();

		/*
		 * por ultimo podemos usar um for dentro de outro for, nesse caso vamos criar um
		 * quadrado formado por um caractere
		 */
		int tam = 20;
		for (int x = 0; x < tam; x++) {
			System.out.print("* ");
			/* um for dentro do for */
			for (int i = 0; i < tam; i++) {
				System.out.print("* ");

			}
			/* uma quebra de linha */
			System.out.println();
		}
	}
}
