package br.com.aed.Logica;

import javax.swing.JOptionPane;

public class Wraper {

	/**
	 * tipos primitivos int, double, char, boolean, short,byte, float podemos por
	 * algun motivo empacotar estes tipos primitivos e tornalos Objetos Por isso �
	 * que existem as Classes Wrapper sao elas: Integer,
	 * Double,Character,Boolean,Short,Byte,Float as classes Wrapper oferecem alguns
	 * recursos de conversao da linguagem java
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/* como criamos um objeto wrapper? */
		Integer in = new Integer(123);
		Character ch = new Character('2');
		Double d = new Double(2.3);
		Boolean b = new Boolean(false);
		/*
		 * nesse caso tenho que criar um primitivo de short e informar como parametro na
		 * wrappre
		 */
		short s = 45;
		Short sh = new Short(s);
		Byte by = new Byte("123");
		Float f = new Float(1.3);

		/* conversoes de valores */

		/* converter double para int */

		int convertido = d.intValue();

		/* converter int para double */
		double valor = in.doubleValue();
		/* outo tipo de conversao, String em int */
		String str = "236";
		int n = Integer.parseInt(str);

		/* por fim String em double */
		String valueDouble = "3.6";
		double t = Double.valueOf(valueDouble);

		/*
		 * vamos apresentar alguns valores numa tela grafica que posteriormente vamos
		 * conhecer melhor
		 */
		int idade = 30;
		String nome = "oscar";
		/* recolhemos uma String */
		String s1 = JOptionPane.showInputDialog("Informe o seu salario");
		/* convertemos em uma double */
		double salario = Double.valueOf(s1);
		JOptionPane.showMessageDialog(null,
				"nome: " + nome + "\n" + "idade: " + idade + "\n" + "salario: R$" + salario);

		System.out.println(valor);

	}
}
