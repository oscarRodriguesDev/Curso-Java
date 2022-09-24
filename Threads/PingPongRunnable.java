package br.com.aed.Threads;

/** Classe para exemplificar o uso de Threads */
/*
 * precisamos implemetar a interface Runnale para que as Threads funcionem, ao
 * invez de extender a classe Thread
 */
public class PingPongRunnable implements Runnable {
	String palavra;
	long tempo;

	public PingPongRunnable(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
		/* Vamos nesta classe imprimir uma paravra em certo tempo */
	}

	/*
	 * metodo que � obrigatoriamente ser implementado quando trabalhamos com o
	 * interface Runnable
	 */
	@Override
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
		/*
		 * Instancia da classe PingPongRunnable, podemos executar a Thread apenas
		 * ultilizando a palavra chave Runnable antes da chamada da classe como mostrado
		 * abaixo, sem nessecdade do metodo Start()
		 */
		Runnable ping = new PingPongRunnable(" ping ", 1500);
		Runnable pong = new PingPongRunnable(" pong ", 2000);
		/* Aqui as Threads que recebem os dois objetos PingPongRunnable Criados */
		new Thread(ping).start();
		/* ainda podemos chamar a Thread adcionando, o nome da Tread */
		new Thread(pong, "pong").start();

	}

}
