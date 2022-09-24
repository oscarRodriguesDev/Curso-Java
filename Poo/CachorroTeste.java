package br.com.aed.Poo;

/*O objetivo desta classe � testar a classe Cachorro*/
public class CachorroTeste {

	/*
	 * Instancia de um objeto e a personifica��o do esqueleto do objeto criado a
	 * partir do esqueleto do objeto que cruiamos podemos instanciar x quantidade de
	 * objetos quando intanciamos um objeto ele passa a ter forma cor e a��es
	 * especificas do objeto
	 */
	/* para que java possa rodar a classe metodo main */
	public static void main(String[] args) {
		/*
		 * instancia do objeto Cachorro Objeto variavel = new Objeto(); esta � a forma
		 * de instanciar um objeto
		 */
		Cachorro viralatas = new Cachorro();
		/*
		 * atravez da variavel que representa o objeto podemos fazer a defini��o dos
		 * atributos e chamadas dos metodos(a��oes) do objeto
		 */
		viralatas.Raca = "viralatas";
		viralatas.Tamanho = 30;
		/* chamada do metodo especifico do objeto */
		viralatas.latir("Vira latas late assim " + "Cain cain cain...");
		/* podemos intanciar quantos cachorros quizermos */
		Cachorro pitbul = new Cachorro();
		/* definir atributos e chamar os metodos */
		pitbul.Raca = "pitbul";
		pitbul.latir("pitbul late assim " + "hou hou hou...");
		/* execute a classe e veja o resultado */
	}

	/* finish class */
}
