package br.com.aed.Heran�a;

//galinha extend Animal
public class Galinha extends Animal {

	public Galinha() {

		super(2, "milho");
		super.dormir();// forma de chamar os metodos da classe abstrata

	}

	void fazerbarulho() {
		System.out.println("c� c� c� c� c�");
	}
}
