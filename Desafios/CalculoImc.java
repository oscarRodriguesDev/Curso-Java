package br.com.aed.Desafios;

import javax.swing.JOptionPane;

public class CalculoImc {
	/** classe � resposta ao desafio do imc */
	public static void main(String[] args) {
		/*
		 * calcular o imc e forncer resultado indicando qual a situa��o de quem analizou
		 * o peso
		 */
		// peso/altura*altura
		double peso;
		double altura;
		double resultado;
		/* como recolher essa altura do usuario */
		/*
		 * vamos recolher usando a classe JOptionPane,m para que possamos recolher os
		 * valores temos que atribuilos a uma variavel
		 */
		String pesoS = JOptionPane.showInputDialog("digite seu peso em kg:");
		String alturaS = JOptionPane.showInputDialog("digite sua altura em metros:");

		/*
		 * agora precisamos fazer algumas opera��es, e qual opera��o devo realizar
		 * primeiro? tenho que elevar a altura ao quadrado, mas se eu fizer isso vai
		 * gerar um erro pois os valores ainda estao no foramato String
		 */
		/* convertemos o valor */
		peso = new Double(pesoS);
		altura = new Double(alturaS);
		/* agora podemos realizar as opera��es */
		// o quadrado do peso
		double alturaQuadrado = altura * altura;
		/* finalmente o resultado */
		resultado = peso / alturaQuadrado;
		/* vamos ver o resultado */
		System.out.println(resultado);
		/* agora a segunda partedo desafio */
		// > que 20 abaixo do peso
		// 20_25 peso ideal
		// 25_30 sobrepeso
		// 30_35 obesidade moderada
		// 35_40 obesidade severa
		// 40_50 obesidade morbida
		// >50 super obesidade
		/*
		 * vamos analizar oresultado e vamos avaliar quais dessas op��es resultado se
		 * encaixa
		 */
		if (resultado < 20) {
			JOptionPane.showMessageDialog(null, "abaixo do peso");

		}
		if (resultado >= 20 && resultado <= 25) {
			JOptionPane.showMessageDialog(null, "peso ideal");

		}
		if (resultado >= 25 && resultado <= 30) {
			JOptionPane.showMessageDialog(null, "sobrepeso");

		}
		if (resultado >= 30 && resultado <= 35) {
			JOptionPane.showMessageDialog(null, "obesidade moderada");

		}
		if (resultado >= 35 && resultado <= 45) {
			JOptionPane.showMessageDialog(null, "obesidade severa");

		}
		if (resultado >= 40 && resultado <= 50) {
			JOptionPane.showMessageDialog(null, "obesidade morbida");

		}
		if (resultado > 50) {
			JOptionPane.showMessageDialog(null, "super obesidade");

		}
		/* fim do desafio */
	}

}
