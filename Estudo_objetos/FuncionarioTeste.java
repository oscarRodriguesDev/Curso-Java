package br.com.aed.Estudo_objetos;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario novato = new Funcionario();// instancia do Funcionario
		novato.setNome("Oscar");// altera o nome do funcionario
		novato.setAtivo(true);// altera se o fucnionario esta ou nao ativo
		/*
		 * usando o if else testamos se o funcionatrio esta ativo ou nao e apresentamos
		 * o resultado correspondente
		 */
		if (novato.isAtivo()) {
			System.out.println("Funcionario " + novato.getNome() + " esta contratado");

		} else {

			System.out.println("Funcionario " + novato.getNome() + " esta demitido");
		}

	}
	/* Finish class */
}
