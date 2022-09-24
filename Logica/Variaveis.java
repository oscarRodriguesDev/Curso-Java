package br.com.aed.Logica;

public class Variaveis {
	/**
	 * variaveis sao referencias a dados, como na escola em que aprendemos algebra,
	 * onde aprendemos adizer que x= 1, ou y=3, e ainda b = x+y
	 */
	public static void main(String[] args) {

		/*
		 * primeira variavel, � do tipo String, variaveis tipo Strings devem ser
		 * declaradas entre aspas duplas
		 */
		String texto = "texto";
		/*
		 * declaramos o tipo do dado, depois declaramos o nome da variavel e podemos
		 * inicializar seu valor
		 */
		System.out.println(texto);
		/* outros tipos */
		int i = 5;
		/* variaveis tipo double aceitam valores decimais */
		double d = 2.6;
		/*
		 * variaveis tipo char devem ser declaradas entre aspas simples e aceitam apenas
		 * um unico valor entre as aspas
		 */
		char c = '2';
		/* variaveis do tipo boolean aceitam apenas os valores true e false */
		boolean b = false;
		/* vamos imprimir os valores declarados */
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		/*
		 * posso declarar variaveis sem declarar seu valor, e podemos declarar varias
		 * variaveis de uma so vez, bastando separar cada uma delas com o caractere
		 * virgula
		 */
		String nome, sobreNome, ultimoNome;
		/* posteriormente podemos declarar seus valores */
		nome = "oscar";
		sobreNome = "rodrigues";
		ultimoNome = "neto";
		/* podemos ainda apresentar todos os dados em uma unica linha */
		System.out.println(nome + " " + sobreNome + " " + ultimoNome);
		/**
		 * variaveis devem come�ar com letras minusculas, nao devem ser iniciadas com
		 * numeros, e em caso de nomes compostos ultilizar padrao comeCase, onde o
		 * primeiro nome come�a com letra minuscula e o segundo nome com letra
		 * maiuscula, voce tambem nao pode usar as plavras reservadas da linguagem java
		 * para declarar suas variaveis
		 */
	}

}
