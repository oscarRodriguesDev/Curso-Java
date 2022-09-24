package br.com.aed.Threads;

public class PonteNaoSincronizada implements Ponte {
	/**
	 * Esta classe � usada para implementar os metods da interface ponte, esta ponte
	 * nao � sincronizada, ou seja temos problemas quando quanto a produ��o e
	 * consumo das informa��es
	 */
	private int valor = -1;

	/* metdo gerado automaticamente */
	@Override
	public void set(int valor) throws InterruptedException {
		this.valor = valor;
		System.out.print("produziu " + valor);

	}

	/* metdo gerado automaticamente */
	@Override
	public int get() throws InterruptedException {
		System.err.print("consumiu " + valor);
		return valor;
	}

}
