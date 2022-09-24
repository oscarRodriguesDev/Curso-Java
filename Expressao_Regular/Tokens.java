package br.com.aed.Expressao_Regular;

public class Tokens {

	public static void main(String[] args) {
		/*
		 * touens sao caracteres informados para que o programa possa fazer uma
		 * separa��o dento da String informada
		 */
		String L = "css;html;javascript;java";
		/* forma de definir o token */
		String[] S = L.split(";");
		/*
		 * toda vez que programa encontrar o caractere esecificado como token ele vai
		 * adcionar o item anterior a ele e depois do ultimo token encontrado a um array
		 * tambem retornado pelo metodo split(String token);
		 */
		/* podemos retornar a quantidades de tokens encontrados */
		System.out.println(S.length + " tokens");
		/*
		 * atraves do foreach podemos listar o conteudo que foi retorndo para o array
		 */
		for (String N : S) {
			System.out.println(N);
		}
	}

}
