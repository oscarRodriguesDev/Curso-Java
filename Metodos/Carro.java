package br.com.aed.Metodos;

/*classe simples com um objeto para testes no metodo com retorno*/
public class Carro {
	String nome;

	/* construtor possui um parametro uma String com o nome do carro */
	public Carro(String nome) {
		this.nome = nome;

		// Vai imprimir o nome do carro
		System.out.println(nome);

	}

	/* este metodo acelera o carro em um valor fixo */
	public void acelerar() {
		System.out.println("acelerando 60 km/h ");
	}

	/*
	 * este metodo acelera o carro para que o mesmo percorra uma distancia em uma
	 * hora
	 */
	public void acelerar(int distancia) {
		int tempo = 1;// valor em hora
		int velocidade = distancia / tempo;
		System.out.println(velocidade + "km/h");
	}

	/* este metodo acelera o carro atraves dos parametros passados */
	public void acelerar(int distancia, int tempo) {
		int velocidade = distancia / tempo;
		System.out.println(velocidade + "km/h");
	}

	/*
	 * este metodo acelera o carro da mesma forma como o metodo acima porem o tipo
	 * dos valore � double
	 */
	public void acelerar(double distancia, double tempo) {
		double velocidade = distancia / tempo;
		System.out.println(velocidade + "km/h");
	}

	/* finish class */
}
