package br.com.aed.Interfaces;

/*devemos usar a palavra reservada implements + o nome da interface*/
public class Quadrado implements AreaCalculavel, VolumeCalculavel {
	double lado;// atributo do quadrado

	public Quadrado(double lado) {
		this.lado = lado;
	}

	// este impplementamos manualmente
	/*
	 * public double calculearea() {
	 * 
	 * return lado * lado ;
	 * 
	 * }
	 */
	@Override
	// este � o metodo criado pela ide quando implementamos a interdface
	// AreaCalculavel
	public double calculearea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}
	/* vamos calcular o voliume deste quadrado */

	@Override
	public double calculavolume() {
		return lado * lado / 2;

	}

}
