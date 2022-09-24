package br.com.aed.Expressao_Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresaoRegular {
	static String nome = "oscar";

	/* breve estudo sobre Regular Expressions */
	public static void main(String[] args) {
		/* retorna um booleano comparando as Strings apresentadas */
		boolean b = "oscar".matches(nome);
		System.out.println(b);
		/*
		 * MODIFICADORES (?i) ignora maiuscula (?x) comentarios (?m)multilinhas
		 * (?m)dottal
		 */
		b = nome.matches("(?i)Oscar");
		System.out.println(b);
		System.out.println(nome);

		/*
		 * META CARACTERES \. Qualquer caracter \d somente digitos[0-9] \D nao � digito
		 * [^0-9] \s espacos [\t \n \x0b \f \r] \S nao � espaco [^\s] \w letra[a-z A-Z
		 * 0-9] \W nao � letra
		 */
		b = "@".matches(".");
		System.out.println(b);
		b = "6".matches("\\d");
		System.out.println(b);
		b = "6".matches("\\w");
		System.out.println(b);
		b = "23".matches("\\d\\d");
		System.out.println(b);
		b = "29161-848".matches("\\d\\d\\d\\d\\d-\\d\\d\\d");
		System.out.println(b);
		/*
		 * QUANTIFICADORES X{n} X,exatamente n vezes X{n,}X, pelo menos n vezs X{n,m}
		 * pelo menos n vezes mas nao mais que m vezes X? 0 ou 1 vez X* 0 ou mais vezes
		 * X+ 1 ou mais vezes
		 */
		b = "61".matches("\\d{2}");
		System.out.println(b);
		b = "612546".matches("\\d+");
		System.out.println(b);
		b = "29161-848".matches("\\d{5}-\\d{3}");
		System.out.println(b);
		b = "31/07/2013".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println(b);
		/*
		 * META CARACTERES DE FRONTEIRA ^ Inicia $ Finaliza | Ou
		 */
		b = "pier21".matches("^pier.*");
		System.out.println(b);
		b = "OscaR".matches("^O.*R$");
		System.out.println(b);
		b = "Sim".matches("Sim|nao");
		System.out.println(b);

		/*
		 * AGRUPADORES [...] agrupamento [a-z] alcance [a-e][i-u] uniao [a-z&&[aeiou]]
		 * intercessao [^abc] excessao [a-z&&[m-p]] subtra��o \x fuga literal
		 */
		b = "a".matches("[a-z]");
		System.out.println(b);
		b = "Oscar".matches("[A-Z][a-z|A-Z]*");
		System.out.println(b);
		// valida��o do meu email:
		b = "khakhalindinho@gmail.com".matches("\\w+@\\w+\\.\\w{2,3}\\.?\\w?\\w?");
		System.out.println(b);
		// op��o do metodo matches
		String Doce = "qual o Doce mais doCe que o doce";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(Doce);
		while (matcher.find()) {
			System.out.println(matcher.group());

			// SUBSTITUI��O

			// encontre isso // substitua
			// por isso
			// System.out.println(r);
			String rato = "o rato roeu a roupa do rei de roma";
			String X = rato.replaceAll("a", "   ");

			System.out.println(X);
			String url = "www.facebook.com/arteswebsite";
			// http//www.arteswebsite.com.br/java
			String S = "(www)(.facebook)(.com/)(\\w{2,})";
			b = url.matches(S);
			System.out.println(b);
			String h = url.replaceAll(S, "http//$1.$4$3java");// "http//$1//.$4 $3 java"
			System.out.println(url);
			System.out.println(h);
		}
	}
}
