package br.com.aed.Collections;

/** classe se destina a estudar elementos genericos */
public class Generico<E> {

	E Element;

	public void setElemnt(E Element) {
		this.Element = Element;
	}

	public E getElement() {
		return (E) Element;
	}

	public static void main(String[] args) {
		/*
		 * quando informo o tipo de elemento que o generico vai conter o unico dado que
		 * pode ser setado e o dado do mesmo tipo informado
		 */
		Generico<String> g = new Generico<String>();
		g.setElemnt("oscar");
		/* posso recuperar o elemento atravez do metodo getElemento() */
		String AA = g.getElement().toUpperCase();
		System.out.println(AA);

	}

}
