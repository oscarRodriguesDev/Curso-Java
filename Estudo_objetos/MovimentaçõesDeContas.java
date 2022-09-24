package br.com.aed.Estudo_objetos;

public class Movimenta��esDeContas
{
/*o propositi o desta classe � testear a classe Conta*/
	public static void main(String[] args) {
		// instancia das contas e seus saldos
		Conta empresa = new Conta("Empresa", 20_000);
		Conta conta = new Conta("oscar", 0);
		Conta conta2 = new Conta("sara", 0);
		conta.exibeSaldo();// exibe o saldo
		conta2.exibeSaldo();// exibe o saldo
		empresa.exibeSaldo();// exibe o saldo
		// realizando o deposito
		empresa.trasferepara(conta, 500);// transfere
		empresa.trasferepara(conta2, 500);// transfere
		conta.exibeSaldo();// exibe o saldo
		conta2.exibeSaldo();// exibe o saldo
		empresa.exibeSaldo();// exibe o saldo
		// realizando um deposito
		conta.deposita(30.0);
		// sacando um valor
		conta2.saca(400.00);
		// exibe o sldo
		conta.exibeSaldo();// exibe o saldo
		conta2.exibeSaldo();// exibe o saldo
		empresa.exibeSaldo();// exibe o saldo

	}

}
