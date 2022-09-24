package br.com.aed.Threads;

public class ContaConjunta {
	/**
	 * classe exemplificando o uso de Threads nao sincronizadas, varios clientes vao
	 * tentar sacar numa mesma conta, em uma aplica��o real isso � possivel mas mas
	 * alguns erros devem ser evitados, como se por acaso o saldo ofor negativo a
	 * Thread bloquear a a��oes para saldo
	 */
	/* nossa conta vai tem saldo unico */
	private int saldo = 100;

	/* metodo para recuperar este saldo */
	public int getSaldo() {
		return saldo;
	}

	/*
	 * metodo que vai realizar o saque da conta vai receber como parametro o vaor a
	 * ser sacado, e o nome do cliente que esta sacando
	 */
	/* a palavra synchronized sincroniza as Threads que vao usart o metodo */
	public synchronized void sacar(int valor, String Cliente) {
		/* veriicar se � possivel realizar o saque do valor */
		if (saldo >= valor) {
			int saldoinicial = saldo;
			System.out.println(Cliente + " vai sacar");
			saldo -= valor;
			try {
				System.out.println("Aguardando processamento...");
				Thread.sleep(1000);
				String msg = Cliente + " sacou " + valor + " [Saldo inicial= " + saldoinicial + " , " + " Saldo final= "
						+ saldo;
				System.out.println(msg);
			} catch (InterruptedException e) {
			}
		} else {

			System.out.println("saldo insuficiente para " + Cliente);
		}
	}
}