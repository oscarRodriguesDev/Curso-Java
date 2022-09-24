package br.com.aed.Estudoarray;

import java.util.Random;

public class EstudoArray {
	static String teste[];// assim definimos a variavel e seu tipo

	public static void main(String[] args) {
		/* chamamos o array dentro do construtor */
		teste = new String[] { "ma�a", "pera", "uva" };
		/*
		 * acessamos os componentes do array, sempre iniciando com o indice em zero
		 */
		System.out.println(teste[0]);
		System.out.println(teste[1]);
		System.out.println(teste[2]);
		/*
		 * saber o tamnho do array, retorna a quantidade de elementos dentro de um array
		 */
		System.out.println(teste.length);
		/* imprime um codigo do objeto array no formato String */
		System.out.println(teste.toString());
		/* e possivel clonar o array */
		String[] teste2 = teste.clone();
		System.out.println(teste2[1] + " e igual a " + teste[1]);
		System.out.println(teste2.length);
		/*
		 * � possivel modificar os elementos de um array mas nao � possivel adcionar
		 * novos elementos
		 */
		teste[0] = "graviola";
		System.out.println(teste[0]);
		System.out.println(teste[1]);
		System.out.println(teste[2]);
		/* introdu��o ao objeto Random */
		/* todo o objeto em java � instanciado assim: */
		Random random = new Random();
		/* para usa-lo precisamos importar a classe Random em java.ultil.Random */
		/*
		 * a classe rando tem muitos metodos e entre eles temos um especificop que nos
		 * informamos um inteiro erecebemos outro inteiro dentro da faixa de valores
		 * informada
		 */
		/*
		 * agora o que eu quero fazer � sempre sortear um elemento aleatorio dentro do
		 * array mas o metodo seleciona um inteiro e meu array � de Strings, bom mas na
		 * verdade quero selecionar o indice do array nao o elemento propiamente dito
		 */
		/*
		 * entao tenho que informar a quantidade maxima de indices dentro do meu array,
		 * posso faze-lo cm o metdo length
		 */
		/* esse metodo da classe random me retorna um inteiro */
		int retorno = random.nextInt(teste.length);
		/* podemos agora imprimir o elemento selecionado da seguinte maneira */
		System.out.println("elemento selecionado: " + teste[retorno]);

	}
}
