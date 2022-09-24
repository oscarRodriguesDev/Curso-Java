package br.com.aed.Threads;

import java.util.Random;

/** Classe representa o produtor */
public class Produtor implements Runnable {
	/* este numero randomico � usado para gerar o tempo que a Thread vai dormir */
	private Random randon = new Random();
	/* recebe uma ponte */
	private Ponte ponte;

	/* construtor recebe como parametro a ponte */
	public Produtor(Ponte ponte) {
		this.ponte = ponte;
	}

	/* metodo Run */
	@Override
	public void run() {
		/* variavel inicializada com total */
		int total = 0;
		/* for para gerar uma quandtidade x de numeros */
		for (int i = 0; i < 5; i++) {
			try {
				/* thread dorme pelo tempo estimada no random */
				Thread.sleep(randon.nextInt(3000));
				/* implementamos o valor da ponte mais o total */
				total += ponte.get();
				/* apresentamos o total */
				System.err.println("\t" + total);
			} catch (InterruptedException e) {
			}
		}
	}

}
