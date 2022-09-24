package br.com.aed.Interfaces;

/*classe triangulo calcula a area e o volume da figura*/
public class Triangle implements VolumeCalculavel, AreaCalculavel {
	double lado;

	/*
	 * o construtor recebe como parametro um double com o valor da medida dos lados
	 */
	public Triangle(double lado) {
		this.lado = lado;
	}

	/* construtor default */
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	/* metodos implementados nesta classe */
	@Override
	public double calculavolume() {

		return lado * lado / 2;
	}

	@Override
	public double calculearea() {

		return lado * lado * lado;
	}

}
