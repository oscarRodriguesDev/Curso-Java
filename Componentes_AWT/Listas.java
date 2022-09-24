package br.com.aed.Componentes_AWT;

import java.awt.FlowLayout;
import java.awt.Frame;
/*cuidado com a importa��o aqui*/
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Listas {
	/*
	 * nesta classe vamos estudar sobre mais um componente AWT o List,o list fornece
	 * um espa�o onde odemos adcinar itens selecionaveis pelo usuario final do
	 * programa, um cuidado especial que se deve tomar ao trabsalhar com listas,
	 * mais especificamente quando se fizer uso de um ide como o eclipse ou
	 * netBeans, e nao trocar o List de java util pelo o List de AWT,visto que os
	 * IDE realizam as importa��es automaticametes
	 */
	public static void main(String[] args) {
		/*
		 * como todo o componete AWT ou at� mesmo Swing preisamos de uma tela para que
		 * os mesmos sejam exibidos
		 */
		Frame f = new Frame();
		f.setSize(200, 200);
		f.setVisible(true);
		/*
		 * Instacia de Lista e recebe doius parametros quantidade: a quantidade de itens
		 * que ser� apresentado para o usuario, selectd: se um dos itens vai estar
		 * selecionado ou nao List(int quantidade, boolean selected)
		 */
		List lista = new List(3, true);
		/*
		 * outras formas de constru��o de uma lista new List() new List(int quantidade)
		 */
		/*
		 * atraves do metodo add(String item ), podemos adcionar itens a nossa lista
		 */
		lista.add("oscar");
		lista.add("sara");
		lista.add("aika");
		lista.add("Nicoli");
		lista.add("kamila");
		lista.add("yashaming");
		lista.add("vitor");
		f.setLayout(new FlowLayout());
		Tratador llo = new Tratador(lista);
		lista.addItemListener(llo);
		lista.addActionListener(llo);

		f.add(lista);

	}

}

/*
 * esta classe tem como fun�ao tratar os eventos de nossa lista, va para o
 * pacote de eventos �para entender como se d� o tratamento de eventos
 */
class Tratador implements ItemListener, ActionListener {
	@SuppressWarnings("unused")
	private List ll;

	public Tratador(List ll) {
		this.ll = ll;
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		System.out.println("Pegou duplo clique de " + str + ".");

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String str = e.getItem().toString();
		System.out.println("Pegou escolha de " + str + ".");
	}

}
