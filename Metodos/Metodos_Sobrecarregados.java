package br.com.aed.Metodos;

/*Metodos podem ter o mesmo nome porem com assinaturas diferentes
 *  a esta possibilidade damos o nome de sobrecargta de metodos*/
public class Metodos_Sobrecarregados {
	/* na classe carro vamos criar quatro metodos com o mesmo nome */
	public static void main(String[] args) {
		/*
		 * como podemos observar na classe carro foram criados quatro metodos, todos com
		 * o mesmo nome e assinatura diferentes vamos instanciar um carro e testar estes
		 * metodos para ver se funciona
		 */

		Carro Fiat = new Carro("Palio");
		/* vamops recuperar o nome do carro */
		System.out.println(Fiat.nome);
		/*
		 * vamos acelerar o carro o metodo abaixo acelera o carro em um valor fixo
		 */
		Fiat.acelerar();
		/*
		 * vamos acelerar o carro passando como parametro apenas a distancia que ele ira
		 * percorrer
		 */
		Fiat.acelerar(20);// valor � dado em kilometros
		/*
		 * vamos acelerar o carro passando como parametro a distancia e o tempo gaso
		 * para pecorrer
		 */
		Fiat.acelerar(100, 3);// valores sao dados em km e hora
		/*
		 * vamos acelerar o carro e passa parametros distancia e tempo porem o tipo do
		 * dado e Double
		 */
		Fiat.acelerar(500.0, 14.0);// valores sao km e hora

		/* teste a classe e veja o resultado */
	}

}
