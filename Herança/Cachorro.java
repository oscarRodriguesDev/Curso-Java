package br.com.aed.Heran�a;

/*classe Cachorro extend Animal(filha da classe animal)*/
public class Cachorro extends Animal {
	// construtor
	public Cachorro() {
		super(5.0, "Ra��o");// precisa receber esta linha indicando os
							// parametros da classe animal
	}

	@Override
	// metodo obrigatorio pois � um metodo abstrato na classe pai
	void fazerbarulho() {
		System.out.println("au au au au au au");

	}
	/* Fibish class */
}
