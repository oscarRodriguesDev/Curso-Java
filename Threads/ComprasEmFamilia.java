package br.com.aed.Threads;

public class ComprasEmFamilia implements Runnable {
	/**
	 * Classe que realiza os saques da conta conjunta, implementa a interface
	 * Runnable
	 */
	/* objeto ContaConjunta comum a todos os clientes */
	ContaConjunta conta = new ContaConjunta();

	public static void main(String[] args) {
		/* aqui vamos rodar varias Threads */
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		/* pai saca */
		new Thread(irAsCompras, "pai").start();
		/* mae saca */
		new Thread(irAsCompras, "mae").start();
		/* irma saca */
		new Thread(irAsCompras, "irma").start();
		/* irmao saca */
		new Thread(irAsCompras, "irmao").start();
		new Thread(irAsCompras, "oscar").start();
		;

	}

	@Override
	public void run() {
		/* recupero o nome da Thread que � o nome do cliente */
		String cliente = Thread.currentThread().getName();
		for (int i = 0; i <= 5; i++) {
			/* clientes vao fazer 5 com�pras */
			conta.sacar(20, cliente);
			if (conta.getSaldo() < 0) {
				System.out.println("estourou...");
			}
		}

	}

}
