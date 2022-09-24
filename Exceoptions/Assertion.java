package br.com.aed.Exceoptions;

import java.util.Scanner;

public class Assertion {
	/*
	 * Oque sao assertions? Quando usar? como ligar e desligar?
	 */
	public static void main(String[] args) {
		/*
		 * Assertions sao verifica��es feitas em seu sitema em tempo de desenvolvimento,
		 * deve ser usada para verificar coisas que nao podem acontecer, mas voce nao
		 * deve usar para testar coisas que podem acontecer
		 */
		System.out.println("digite um numero de 0 a 10");
		@SuppressWarnings("resource")
		int numero = new Scanner(System.in).nextInt();
		/*
		 * por default as asserts estao desativadas, e por isso essa verifica�o nao ser�
		 * feita
		 */
		assert (numero >= 0 && numero <= 10) : "numero invalido";

		/*
		 * como ligar assertions no eclipse coloque o simbolo (-ea) no caminho abaixo
		 * Run>> run configurations>>> aba arguments>>> jvm(-ea)
		 */

		/*
		 * como desligar assertions no eclipse coloque o simbolo (-da) no caminho abaixo
		 * Run>> run configurations>>> aba arguments>>> jvm(-da)
		 */

		System.out.println("vc digitou " + numero);
	}

}
