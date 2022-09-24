package br.com.aed.Conhecimento_Avan�ado;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursao {
	/** Classe se destina a exemplificar o uso de metodos recursivos */

	/*
	 * metodos recursivos dividem os problemas em duas partes, uma parte que ele nao
	 * sabe resolver e outra parte que ele sabe resolver
	 */
	/* o metodo abaixo realiza a soma iniciando de zero at� o numero informado */
	public static int soma(int x) {

		/*
		 * qual a parte que eu sei?, que se x for igua a zero entao o resultado e x
		 */

		if (x == 0) {
			return x;
			/*
			 * qual a parte que nao sei, se o numero for diferente de zero, entao vou
			 * trabalhar para igualar o numero a zero
			 */
		}
		/* condi��o caso o numero seja menor que zero */
		if (x < 0) {
			System.out.println(x);
			return x + soma(x + 1);
		} else {

			/* ou seja vou somar x + a soma de (x-1) at� x = 0 */
			return x + soma(x - 1);

		}

	}

	/* metodo recursivo para calcular potencia */
	public static int Potencia(int x, int e) {

		/* se x for igual a zero ele sempre retorna zero */
		if (x == 0) {

			return x;
		}
		/* se o e = zero temos uma opera��o invalida */
		if (e == 0) {

			System.out.print("ERR");
			return 0;
		}
		/*
		 * parte que sabemos resolver, se o numero for igual a um, entao retornamos o
		 * propio numero
		 */
		if (e == 1) {
			System.out.println(x);
			return x;

		}
		/*
		 * se x for maior que um, entao vamos multiplicar x pela potencia de (x,e-1),
		 * quando e cair na condi�ao de ser igual a 1 ele sos tretorna o valor
		 */
		if (e > 1) {
			/* A * A // */
			int y = x * Potencia(x, e - 1);
			return y;
		}

		return 0;
	}

	/* metodo subtrai */
	public static int subtrai(int x) {
		/* se x = 0 enao so retornar o propio numero */
		if (x == 0) {

			return x;
		} else {
			/* caso contrario ele vai subtrair de x a subtra��o de x-1 */
			return x - subtrai(x - 1);
		}

	}

	/*
	 * metodo abaixo lista diretorios recurssivamente recebe como parametro um
	 * caminho Qual a parte que sei?
	 */
	public static void Listar(Path path) throws IOException {
		/* se for um arquivo regular vamos imprimir seu caminho completo */
		if (Files.isRegularFile(path)) {

			System.out.println(path.toAbsolutePath());
		}
		/* caso contrario vamos percorrer o diretorio */
		if (Files.isDirectory(path)) {
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
				for (Path pat : stream) {
					/* e vamos percorrer cada caminho encontrado */
					String s = "\n" + pat.toAbsolutePath();
					System.out.println(s.toUpperCase());
					/*
					 * e para cada caminho encontrado vamos usar a recursividade para definir o que
					 * fazer com o arquivo encontrado
					 */
					Listar(pat);
				}
			} catch (Exception e) {
			}

			// System.out.println(path.toAbsolutePath());
		}
	}

	public static void main(String[] args) throws IOException {

		System.out.println(soma(6));
		System.out.println(Potencia(1, 0));
		System.out.println(subtrai(9));
		Listar(Paths.get("C:/"));
	}

}
