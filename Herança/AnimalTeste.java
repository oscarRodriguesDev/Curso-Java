package br.com.aed.Heran�a;

public class AnimalTeste {

	public static void main(String[] args) {
		// instancia de Cachorro
		Cachorro pincher = new Cachorro();
		pincher.fazerbarulho();
		pincher.dormir();

		Galinha carij� = new Galinha();
		carij�.fazerbarulho();
		// galinha nao precisa dormir pois na sua constru��o ela ja est�
		// dormnindo

	}
	/* Classes extendidas possuem os mesmos atributos e metodos das classes pai */
}
