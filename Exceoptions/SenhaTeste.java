package br.com.aed.Exceoptions;

public class SenhaTeste {
	/* nesta classe vamos testar nossa SenhaInvalidaException */
	/*
	 * criamos um metodo para fazer uma compara��o de duas Strings informadas, se
	 * elas forem iguais tudo cedrto mas se forem diferentes o metodo vai lancar uma
	 * excessao, o metodo recebe como parametro uma String que � a senha que ser�
	 * avaliada
	 */
	static void Autenticar(String senha) throws SenhaInvalidaException {
		/* verifica��o de compara��o entre a senha correta e a senha informada */
		if ("123".equals(senha)) {
			/* condi��o se a senha estiver correta */
			System.out.println("Seja bem vindo");
		} else {
			/* condi��o se a senha estiver icorreta */
			/*
			 * esta � a forma de lancar a excessao que criamos usamos a palavra chave trows
			 */
			throw new SenhaInvalidaException("Senha invalida");
		}

	}

	public static void main(String args[]) {
		/* aqui vamos hamar o metodo Autenticar(senha), e vamos tratar as excessoes */
		try {
			Autenticar("123");

		} catch (SenhaInvalidaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
}
