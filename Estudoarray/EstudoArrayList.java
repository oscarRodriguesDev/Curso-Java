package br.com.aed.Estudoarray;

import java.util.ArrayList;

public class EstudoArrayList {
	/** classe exemplifica o uso de ArrayLists */
	public static void main(String[] args) {
		/*
		 * A ArrayList e construido da seguinte forma: ArrayList<tipo> variavel = new
		 * ArrayList<tipo#>();
		 */
		ArrayList<String> nomes = new ArrayList<>();
		/*
		 * diferentes dos arrays os ArrayList podem adcionar elementos a qualquer
		 * momento atravez do metodo add()
		 */
		nomes.add("oscar");
		/* posso adcionar quantos nomes eu quiser */
		nomes.add("sara");
		nomes.add("aika");
		nomes.add("nicoli");
		nomes.add("elizabeth");
		nomes.add("sandrinha");
		/*
		 * como posso recuperar os nomes dentro do meu ArrayList?, atravez do metodo
		 * toString()
		 */
		System.out.println(nomes.toString());
		/* podemos assim como nos Arrays percorrer o nosso ArrayList, veja como: */
		for (int i = 0; i < nomes.size(); i++) {
			/*
			 * aqui dentro vamos imprimir o nome na posi��o i apenas para melhorar a
			 * visualiza��o vamos apresentar o indice correspondente ao item encontrado no
			 * for
			 */
			String info = i + "� indice " + nomes.get(i);
			if (i == 0) {
				info = i + "  indice " + nomes.get(i);

			}
			System.out.println(info);
			/*
			 * observa��o: o indice dentro de um ArrayList tambem se inicia em zero sempre
			 */

		}
		System.err.println("o for percorreu cada um dos nomes do Array e os apresentou no console\n");

		/*
		 * outros metodos do ArrayList:
		 */

		/* remove o elemeto no nivel indicado */
		nomes.remove(2);
		System.out.println("depois de executar o metodo remove() " + nomes.toString());
		/* adciona um elemento no indice indicado */
		nomes.set(2, "knider");
		System.out.println("depois de adcionar com o metdo set(indice, element) " + nomes.toString());
		/*
		 * retorna booleano informando a ocorrencia do valor informado nmo parametro
		 */
		boolean existe = nomes.contains("knider");
		System.out.println(existe);
		/* limpa todo o ArrayList */
		nomes.clear();
		System.out.println("depois de executar o metodo clear() " + nomes.toString());
	}

	/* execute a classe e veja o resultado */
}
