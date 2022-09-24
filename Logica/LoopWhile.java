package br.com.aed.Logica;

public class LoopWhile {
	/** classe se destina a demonstrar o uso do while */
	public static void main(String[] args) {
		// while (expressao) {sentencas}
		/* vamos construir nosso primeiro while */
		/**
		 * while (true) { /* este loop vai ficar executando infinitamente, at� que se
		 * desligue o pc
		 *
		 * System.out.println("rodando"); }
		 */
		/* esse while analiza uma variavel criada fora do loop */
		int w = 0;
		while (w < 5) {
			/*
			 * enquanto a variavel for menor que 5 o loop pvai imprimir o valor da variavel
			 */
			w++;// se eu nao incrementar o loop vai rodar etenramente
			System.out.println(w);
		}

		/* usando o break */
		int w1 = 0;
		while (w1 < 20) {
			w1++;
			System.out.println(w1);
			/*
			 * o loop vai rodar ate que a variavel seja igual a dez e com a palvra chave
			 * break, informamos para a aplica��o que queremos que o loop seja parado quando
			 * a variavel for igual a dez
			 */
			if (w1 == 10) {
				break;

			}

		}

	}

}
