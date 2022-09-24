package br.com.aed.Eventos_java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*implementamos a interface ActionListener que vai tratar os cliques do botao ou seja
 * o que o botao v ai fazer quando for clicado*/
public class TrataBotao implements ActionListener {
	/*
	 * action performade e o metodo que vai tratar os eventos ele recebe como
	 * parametro um ActionEvent
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * atraves desse ActionEvent podemos recuperar algumas informa��es do objeto que
		 * estamos delegando a�oes
		 */
		/*
		 * traz informa��es relevantes sobre o componente em uma unica linha, no caso um
		 * array
		 */
		System.out.println(e.getSource());
		/* o comando do botao ou o nome quelhe concedemos quando foi criado */
		System.out.println(e.getActionCommand());
		/* retorna um id do botao */
		System.out.println(e.getID());
		/*
		 * no caso desse tratador vamos exibir uma mensagem dizendo que usuario clicou
		 * no botao+ o nome do botao
		 */
		System.out.println("clicou " + e.getActionCommand());

	}

}
