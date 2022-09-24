package br.com.aed.Threads;

/*vamos criar o seguinte esquema:
 * um produtor de informa��es produz informa�oes e as 
 * armazena em uma ponte nao sincronizada, e um consumidor consome tais informa��es*/
public interface Ponte {
	/** esta interface representa a ponte */
	/* este metodo � usado pelo produtor para produzir informa��es n ponte */
	public void set(int valor) throws InterruptedException;

	/* espte metodo recupera as informa��es da ponte */
	public int get() throws InterruptedException;
}
