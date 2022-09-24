package br.com.aed.Metodos;

public class Matematica {
	/**
	 * 
	 * 
	 * @param um
	 * @param dois
	 * @return
	 */
	/*
	 * estudo de metodos sobrecarregados o metdo abaixo recebe dois parametros int 1
	 * e int2 o metdo abaixo compara os dois valores e retorna o maior deles
	 */
	public int Maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}

	}

	/*
	 * este metodo soma valores do tipo double, com uma peculiaridade este metodo
	 * soma quantidade de valores indefinidos
	 */
	public double soma(double... numeros) {
		double Total = 0;/* o valor de total deve ser inicializado */
		for (double n : numeros) {
			Total += n;/* o valor de total � incrementado a n */
		}
		return Total;
		/* return Total; */
	}

	/*
	 * metodo abaixo extrai a raiz do numero que desejarmos este metdo so nos
	 * resulta como raiz um inteiro se ultilizarmos um valor double, e lancado um
	 * erro e a classe nao pode ser executada
	 */
	public int Raiz(int numero) {
		int Raiz = 0, impar = 1;
		while (numero >= impar) {
			numero -= impar;
			impar += 2;
			++Raiz;

		}
		return Raiz;
	}

	/*
	 * metodos sobrecarregados podem ter o mesmo nome com assinaturas difereentes
	 */
	public double Media(int X, int Y) {
		System.out.print("Media(int X, int Y)");
		return (X + Y) / 2;
		/* metodo calcula a media de dois numeros interiros */
	}

	public double Media(double... numeros) {
		System.out.print("Media(int...numeros)");
		return this.soma(numeros) / numeros.length;
		/* metodo calcula a media de dois numeros Double */

	}

	public double Media(String X, String Y) {
		/*
		 * metodo calcula a media de dois numeros double, mas o valor que indicamos �
		 * uma String, entao o metdo converte os valores e calcula a media
		 */
		System.out.print("Media(String X, String Y)");
		double x = Double.parseDouble(X);
		double y = Double.parseDouble(Y);
		return (x + y) / 2;
		/*--------------------finish class----------------------------------*/

	}
}
