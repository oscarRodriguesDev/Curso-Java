package br.com.aed.Poo;

public class GalinhaTeste {
	/* A fun��o desta classe � apenas testar a classe Galinha */
	public static void main(String[] args) {
		/*
		 * podemos instanciar quantas galinhas quizermos mas a variavel usada dever� ser
		 * diferente para cada uma, ou seja nao podemos ter dois objetos com nomes
		 * iguais numa mesma classe
		 */
		Galinha G = new Galinha();
		Galinha G1 = new Galinha();

		G1.botar().botar().botar().botar();
		/*
		 * podemos a partir da instancia da primeira galinha chamar o metodo botar
		 * quantas vezes for nesse�aria
		 */
		G.botar().botar().botar().botar();
		/* resultado, quantidade dos ovos que a galinha ja botou */
		System.out.println(G.ovos);
		System.out.println(G1.ovos);
		/*
		 * retorna a quantidade dos ovos da granja diretamente pela classe sem
		 * nessecidade de instancia
		 */
		System.out.print(Galinha.ovos_da_granja);
		/*
		 * retorna a media dos ovos tambem diretamente usando o nome da classe apenas
		 * sem nessecidade de Instanciar
		 */
		System.out.print(Galinha.mediaovos(2));
	}

}