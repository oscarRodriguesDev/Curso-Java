package br.com.aed.BancoDeDados;

public class Conta {
	/* numero da conta */
	int numero;
	/* nome do cliente */
	String nome;
	/* saldo da conta */
	double saldo;

	/*
	 * esta clsse representa a conta do usurio que ser� gravada e recuperada do
	 * banco de dados, recebebe como parametro o numero da conta, o nome do usuario,
	 * e o saldo da conta
	 */
	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return numero + "," + nome + "," + saldo;
	}
}
