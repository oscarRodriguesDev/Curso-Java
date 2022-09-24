package br.com.aed.Logica;

/**
 * classe se destina a mostrar os diverso tipos de operadres da linguagem java
 */
public class OperadoresJava {
	/**
	 * Os operadores s�o sinais que representam atribui��es, c�lculos e ordem dos
	 * dados. As opera��es seguem uma ordem de prioridades, ou seja, alguns c�lculos
	 * (ou outros) s�o processados antes de outros
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * ponto e virgula serve para separar instru�oes, A QUEBRA DE LINHA NAO SEPARA
		 * INSTRU�OES ex:
		 */
		int x;
		int y;
		double z;
		/*
		 * separador ponto (.), pode ser usado para separar numeros com parte fracionada
		 * do tipo double
		 */
		double d = 2.5;// parte fracionada

		/*
		 * separador virgula, usado para separar varias instru�oes dentro de uma mesma
		 * instru��o
		 */
		/* um array */

		boolean[] bol = { true, false, true, true, true, false, false, true, false };
		/* declarando varias Variaveis de uma so vez */
		String nome, sobrenome, ultimoNome;
		int value, a, b;
		/*
		 * tambem pode separar as diversas interfaces que podem implementar uma classe
		 */
		/*
		 * Par�nteses, colchetes e chaves Em Java, as chaves s�o utilizadas para separar
		 * blocos de programa��o e os colchetes s�o utilizados para indicar/separar os
		 * �ndices de vetores (e, tamb�m, na declara��o dos mesmos vetores).
		 */
		/* operadore matematicos */
		System.out.println(1 + 2);// soma
		System.out.println(2 * 2);// multiplica��o
		System.out.println(9 / 3);// divisao
		System.out.println(9 - 3);// subtra��o
		/* resto da divisao do primeiro para o ultimo numero */
		System.out.println(9 % 2);
		/* operadores de incremento e decremento */
		int i = 1;
		System.out.println(i);// valor de i
		/* incrementa depois aprsenta */
		System.out.println(++i);// valor incrementado de i 2
		/* decrementa e depois apresenta */
		System.out.println(--i);// valor decrementado de i 1
		/* apresenta depois incrementa */
		System.out.println(i++);// valor incrementado de i 2
		/* apresenta deois incrementa */
		System.out.println(i--);// valor decrementado de i 2
		System.out.println(i);
		/* tenho duas variaveis do tipo inteiro e quero somar elas */
		// maneira conhecida:
		int c = 3, e = 2, f = c + e;
		/* podemos ver o resultado */
		System.out.println("3+2 = " + f);
		// maneira mais facil
		System.out.println("3+2 = " + (c += e));
		/* vamos redefinir os valores iniciais para as variaveis */
		c = 3;
		e = 2;

		// pode ser feito para subtra�ao tambem
		System.out.println("3-2= " + (c -= e));

		/* operadores de compara��o */
		System.out.println("p" == "p");// retorna true ou false
		System.out.println(4 != 5);// retorna true ou false
		System.out.println(4 > 5);
		System.out.println(4 < 5);
		System.out.println(4 >= 5);
		System.out.println(4 <= 4);// aqui retorna true porque � igual 4
		/* instanceof analiza se um objeto � ou nao uma instancia de outro */
		String name = "oscar";
		System.out.println(name instanceof String);
		/* criamos este objeto apenas para compara��o */
		OperadoresJava cc = new OperadoresJava();
		System.out.print(cc instanceof OperadoresJava);
		/* operadores logicos */
		// vamos usar um if else mas a frente detalhamos mais
		int xx = 10;
		int yy = 5;

		/*
		 * analiza duas ou mais condi�oes ao mesmo tempo condi��o A e condi��o B �
		 */
		if (xx < 10 && yy > 5) {
			// entao realiza alguma coisa aqui
		}
		/*
		 * analiza duas ou mais condi�oes ao mesmo tempo Condi��o A ou condi��o B
		 */
		else if (xx == 10 || yy > 100) {
			// entao realiza alguma coisa aqui
		}

		// () chamada de metodo
	}
}
