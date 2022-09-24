package br.com.aed.Threads;

/** Classe para exemplificar o uso de Threads */

public class PingPong extends Thread {
	String palavra;
	long tempo;

	/*
	 * vimos varios exemplos de programas mas todos eles rodavam apenas Uma
	 * thread,mas em um programa profissional � provavel que encontremos varias
	 * Threads sendo executadas ao mesmo tempo Programas que excutam uma so THread
	 * sao chamados sequenciais// Programas que executam varias Thread ao mesmo
	 * tempo sao chamados MultiThreads
	 */
	public PingPong(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
		/* Vamos nesta classe imprimir uma paravra em certo tempo */
	}

	public void run() {
		try {
			/* Este for vai definir o que ai acontecer na Thread */
			for (int i = 0; i < 100; i++) {
				/* Vamos imprimir uma palavra em certo intervalo de tempo */
				System.out.print(palavra);
				/* o metodo abaixo define o intervalo de tempo */
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			/*
			 * o metod Sleep lanca uma InterruptedException deve ser sempre tratada
			 */
			return;
		}

	}

	public static void main(String[] args) {

		new PingPong(" ping ", 1500).start();
		new PingPong(" pong ", 2000).start();

	}

}
