package br.com.aed.Interfaces;

public class RetangleArea implements AreaCalculavel {
	double ladoA;
	double ladoB;

	public RetangleArea(double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	@Override
	public double calculearea() {
		return ladoA * ladoB;
	}

}
