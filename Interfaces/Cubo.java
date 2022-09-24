package br.com.aed.Interfaces;

public class Cubo implements VolumeCalculavel, AreaCalculavel {
	/* cubo para caluculo da area e volume */
	double lado;

	public Cubo(double lado) {
		this.lado = lado;
	}

	/* metodos implementados */
	@Override
	public double calculavolume() {

		return 6 * lado * lado;
	}

	@Override
	public double calculearea() {

		return lado * lado * lado;
	}

}
