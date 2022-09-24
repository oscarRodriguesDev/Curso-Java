package br.com.aed.classeMath;

public class MathTest {
	/*
	 * EstaClasse destina-se a exemplificar a classse Math usada para calculos
	 * matematicos
	 */
	public static void main(String[] args) {
		/*
		 * os metodos da classe Math sao todos statics
		 * 
		 * calcular o seno
		 */
		System.out.println("seno de 10 " + Math.sin(10));
		/* calcular o coseno */
		System.out.println("coseno de 10 " + Math.cos(10));
		/* calcular a tangente */
		System.out.println("tangente de 45 " + Math.tan(45));
		/* calcular o proximo numero */
		System.out.println("numero apos 10 " + Math.nextUp(10));
		/* calculando o numero anterior ao numero informado */
		System.out.println("numero anterior a 10 " + Math.nextDown(10));
		/*
		 * calcular a potencia por primeiro parametro � o numero do qual extrairemos a
		 * potencia correspondente no segundo parametyro
		 */
		System.out.println("4 elevado a 5 potencia " + Math.pow(4, 5));
		/* calculando a raiz quadrada de um numero */
		System.out.println("raiz quadrada de 16 " + Math.sqrt(16));
		/* calculando a raiz cubica de um numero */
		System.out.println("raiz cubica de 27 " + Math.cbrt(27));
		/* calculo da hipotenusa */
		System.out.println("valor da hipotenusa cat 2,4 " + Math.hypot(2, 4));
		/* Execute a classe e veja os resultados */
		/*
		 * observa�ao os parametros usados podem ser do tipo long ou double
		 * 
		 */

	}

}
