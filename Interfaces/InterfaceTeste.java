package br.com.aed.Interfaces;

/*a figura ser� capaz de calcular sua propia area/volume*/
public class InterfaceTeste {
	public static void main(String[] args) {
		/* instanciamos o quadrado e ele mesmo vai calcular sua area */
		Quadrado q = new Quadrado(10);
		double area = q.calculearea();
		System.out.println(area + "cm2");
		double volume = q.calculavolume();
		System.out.println(volume);
		// area e volume do triangulo
		Triangle t = new Triangle(6);
		double area1 = t.calculearea();
		double volume1 = t.calculavolume();
		System.out.println(area1);
		System.out.println(volume1);
		// area e volume do cubo
		Cubo c = new Cubo(10);
		double area2 = c.calculearea();
		double volume2 = c.calculavolume();
		System.out.println(area2);
		System.out.println(volume2);

	}
}
