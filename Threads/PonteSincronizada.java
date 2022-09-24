package br.com.aed.Threads;

public class PonteSincronizada implements Ponte {
	/** Esta classe representa uma ponte Sincronizada */
	private int valor = -1;
	/* boolean para verificar se a ponte esta ocupada ou nao, status da ponte */
	private boolean ocupado = false;

	/* metodos gerados automaticamente pelo IDE */
	@Override
	public synchronized void set(int valor) throws InterruptedException {
		this.valor = valor;
		/*
		 * vamos avaliar se a ponte esta cheia ou vazia, ou seja se houver numero na
		 * ponte o produtor nao pode gerar numeros
		 */
		while (ocupado) {
			System.out.println("ponte cheia. Produtor aguarde!");
			/* o metodo wait(), para o metodo enquanto a ponte estiver cheia */
			wait();
		}
		System.out.print("produziu " + valor);
		ocupado = true;
		/*
		 * o metodo abaixo notifica a todos as Threads que meu Status nesse caso o
		 * boolean ocupado, mudou seu estado e as outras Threads ja podem ser executadas
		 */
		notifyAll();

	}

	@Override
	public synchronized int get() throws InterruptedException {
		/*
		 * neste metodo vamos avaliar se a ponte esta vazia se estiver vazia o metdo get
		 * para sua execu��o, nao h� nessecidade de executar o metodo se a ponte esta
		 * vazia
		 */
		while (!ocupado) {
			System.out.println("ponte vazia. consumidor aguarde!");
			/* metodo para o metodo set at� a ponte estar cheia */
			wait();
		}
		System.err.print("consumiu " + valor);
		ocupado = false;
		/*
		 * notifica todas a Threads que o Status de avalia��o mudou eque elas ja podem
		 * ser executados
		 */
		notifyAll();
		return valor;
	}
}
