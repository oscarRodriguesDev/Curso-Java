package br.com.aed.Heran�a;

/*classes abstratas nao podem ser instanciadas,
 *  a classe Animal e a classe masi generica todos os outros 
 *  animais vao ser extendidos dela*/
public abstract class Animal {
	// atributos de animal
	double peso;// peso
	String comida;// tipo de comida que come

	/* contrutor de animal como parametro o peso e o tipo dde comida */
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;

	}

	/* metodo dormir */
	void dormir() {
		System.out.println("ZZZZZZZZZZ");

	}

	/*
	 * metodos abstratos nao possuem corpo mas devem ser implementados na classe que
	 * ops chama
	 */
	abstract void fazerbarulho();
}
/* Finish class */