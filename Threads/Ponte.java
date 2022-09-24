package br.com.aed.Threads;

/*vamos criar o seguinte esquema:
 * um produtor de informações produz informaçoes e as 
 * armazena em uma ponte nao sincronizada, e um consumidor consome tais informações*/
public interface Ponte {
	/** esta interface representa a ponte */
	/* este metodo é usado pelo produtor para produzir informações n ponte */
	public void set(int valor) throws InterruptedException;

	/* espte metodo recupera as informações da ponte */
	public int get() throws InterruptedException;
}
