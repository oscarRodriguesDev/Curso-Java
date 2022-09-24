package br.com.aed.Escritorio;

import java.io.Serializable;/*esta importa��o permite a serializa��o deste objeto */

public class Conta implements Serializable {

	/**
	 * o proposito desta classe � mostar construtores e metodos com parametros
	 */
	/*
	 * numero serial do objeto gerado pela pode ser usado para que o arquvo
	 * serializado seja recuperado em outras versoes
	 */
	private static final long serialVersionUID = -1063175536713506944L;
	/* classe conta p�recisa de um cliente dono da conta */
	public String cliente;
	/* este cliente tem um saldo */
	public double Saldo;

	/* metodo para recuperar o cliente */
	public String getCliente() {
		return cliente;
	}

	/* metodo para retornar o saldo */
	public double getSaldo() {
		return Saldo;
	}

	/*
	 * Construtor contendo como parametros uma String com o nome do cliente e um
	 * double com o valor do saldo
	 */
	public Conta(String cliente, double Saldo) {
		this.cliente = cliente;
		this.Saldo = Saldo;
	}

	public Conta() {

	}

	/* metodo que exibe o saldo nas defini�oes da mensagem abaixo */
	public void exibeSaldo() {
		/* mensagem que �xibida pelo metodo */
		System.out.println(cliente + " seu saldo �  \n R$" + Saldo);

	}

	/* metodo para sacar o valor do saldo */
	public void saca(double valor) {
		/* vai retirar do Salvo o valor */
		Saldo = Saldo - valor;
	}

	/* metodo deposita parametro valor */
	public void deposita(double valor) {
		/* adciona ao saldo o valor */
		Saldo += valor;

	}

	/* metodo trasfere para parametro conta e o valor */
	public void trasferepara(Conta outra, double valor) {
		// conta saca o valor da minha conta
		this.saca(valor);
		// deposita na outra conta o valor
		outra.deposita(valor);
	}
	/* Finish class */
}
