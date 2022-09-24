package br.com.aed.Enumera��es;

public enum EnumInt {
	// enumera��o de inteiros
	NUMERO(0), NUMERO1(1), NUMERO2(2), NUMERO3(3);

	int Valores;// variavel tipo int
	/* Construtor recebendo uma variavel do mesmo tipo da constante */

	EnumInt(int Valores) {
		this.Valores = Valores;
	}

}
