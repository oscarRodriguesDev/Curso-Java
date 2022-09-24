package br.com.aed.Threads;

public class PonteTesteNaoSincronizada {
	/** Classe que instancia a ponte, o produtor e o consumidor */
	public static void main(String[] args) {

		/* ponte nao sincronizada */
		Ponte ponte = new PonteNaoSincronizada();

		/* aqui as Threads sao chamadas informando o produtor que recebe a ponte */
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();

	}

}
