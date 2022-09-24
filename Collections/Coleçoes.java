package br.com.aed.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Coleçoes
{

	/**
	 * nesta aula vamos come�ar a trabalhar com as cole��es java, para mais
	 * informa��es leia o arquivo que acompanha o pacote
	 */
	public static void main(String[] args) {
		/*
		 * usamos a classe collection e podemos instanciar o nosso ja conhecido
		 * ArrayList
		 */
		Collection<String> c = new ArrayList<String>();
		/*
		 * atravez do metodo add(value), podemos adcionar quantos valores desejarmos
		 * dentro do ArrayList
		 */
		c.add("Adciona");
		c.add("c++");
		/*
		 * o metodo toString() apresenta todos os valores ja adicionados ao ArrayList
		 */
		System.out.println(c.toString());
		/* o metodo isEmpty(), verifica se a minha cole��o esta ou nao vazia */
		System.out.println(c.isEmpty());
		/*
		 * o metodo contains verifica se o parametro informado esta ou nao na minha
		 * cole��o
		 */
		System.out.println(c.contains("java"));
		/* o metodo remove(Param),m remove o parametro indicado */
		c.remove("java");
		System.out.println(c.toString());

		/* metodos para trabalhar com grupos de elementos */

		/* abaixo usamos a cole��o para criar uma List */
		Collection<String> c2 = Arrays.asList("oscar", "sara", "aika", "nicole");
		/*
		 * com o metodo addAll(collection) podemos adcionar uma cole��o de ntro de outra
		 * cole��o
		 */
		c.addAll(c2);
		/*
		 * o metodo containsAll(collection), verifica se dentro da cole��o avaliada
		 * existe a cole��o informada no parametro
		 */
		System.out.println(c.containsAll(c2));
		/* remove todos os elemntos da minha cole�ao secundaria */
		// c.removeAll(c2);
		/* podemos percorrer toda minha cole��o com o for each */
		for (String string : c) {
			/* podemos apresentar toda a cole��o que encontramos */
			System.out.println("element " + string);
			/*
			 * e por fim vamos transformar toda nossa cole��o em um array de Strings
			 */
			String[] cc = c.toArray(new String[c.size()]);
			/* e apresentar este array */
			System.out.println(Arrays.toString(cc));
			/*
			 * depois de tyudo podemos limpar a nossa cole��o com o mtodo clear()
			 */
			/* obs se tirar do bloco de comentario da erro */
			// c.clear();

		}

	}

}
