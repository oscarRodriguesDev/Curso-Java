package br.com.aed.Conhecimento_Avan�ado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		String nome = "br.com.aed.Escritorio.Conta";
		/*
		 * o metodo abaixo recupera a classe pelo nome da mesma, lanca excessoes do tipo
		 * ClassNotFoundException, quando nao consegue encontrar a classe especificada
		 */
		Class classe = Class.forName(nome);
		/* retorna o nome simplificado da classe */
		System.out.println("Classe " + classe.getSimpleName());
		/*
		 * retorna todos os atributos publicos da classe, num array do tipo Field
		 */
		Field[] f = classe.getFields();
		/* atravez do for each podemos recuperar cada um dos atributos */
		for (Field field : f) {
			System.out.println("public " + field);

		}
		/* retorna um array com todos os metodos declarados da classe */
		Method[] metodo = classe.getDeclaredMethods();
		/* novamente um for each percorre os metod s e podemos apresena-los */
		for (Method m : metodo) {
			System.out.println("metodo " + m.getName());
		}
		/* retorna um array com todos os construtores da classe */
		Constructor[] C = classe.getConstructors();

		for (Constructor c : C) {
			System.out.println("Construtor " + c.getName());
		}
		/* Criamos um novo objeto atraves do metodo new Instance() */
		Object o = classe.newInstance();
		/* posso invocar os metodos da classe aqui representada */
		Method md = classe.getMethod("deposita", double.class);
		md.invoke(o, 120);
		/*
		 * vamos exibir o saldo, neste exemplo nao possui nome de cliente porque o
		 * construtor recuperado foi o construtor vazio
		 */
		Method md1 = classe.getMethod("exibeSaldo");
		md1.invoke(o);
		/* vamos recuperar o construtor com o nome cdo cliente */
		Constructor co = classe.getConstructor(String.class, double.class);
		/* Criamos um novo objeto */
		Object novo = co.newInstance("oscar", 50);
		/* e podemos usar os mesmos metodos anteriores, com seus novos parametros */
		md.invoke(novo, 120);
		md1.invoke(novo);

	}
}