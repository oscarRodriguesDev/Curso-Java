package br.com.aed.Herança;

public class AnimalTeste {

	public static void main(String[] args) {
		// instancia de Cachorro
		Cachorro pincher = new Cachorro();
		pincher.fazerbarulho();
		pincher.dormir();

		Galinha carijó = new Galinha();
		carijó.fazerbarulho();
		// galinha nao precisa dormir pois na sua construção ela ja está
		// dormnindo

	}
	/* Classes extendidas possuem os mesmos atributos e metodos das classes pai */
}
