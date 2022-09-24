package br.com.aed.Threads;

import java.util.Random;

public class Consumidor implements Runnable {
	private Ponte ponte;

	public Consumidor(Ponte ponte) {
		this.ponte = ponte;
	}

	private Random randon = new Random();

	@Override
	public void run() {
		/*
		 * a unica mudanca nesta classe em rela��o a produtora � que aqui nos inserimos
		 * valores, na ponte
		 */
		int total = 0;
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(randon.nextInt(3000));
				total += i;
				/* aqui os valores gerados sao inseridos */
				ponte.set(i);
				System.out.println("\t" + total);
			} catch (InterruptedException e) {
			}
		}
	}

}
