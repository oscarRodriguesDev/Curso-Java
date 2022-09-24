package br.com.aed.Componentes_AWT;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menus {
	/* o objetivo dessa classe � apresentar a forma de se ultilizar o menu AWT */
	public static void main(String args[]) {
		Frame frame = new Frame();
		/* precisamos de um objeto MenuBar(bara de menu */
		MenuBar bar = new MenuBar();
		/*
		 * depois precisaremos de um objeto Menu, os menus sao adcionados ao MenuBar
		 * atraves do metodo add(String menu),cada menu recebe como parametro uma String
		 * que vai ser o nome para aquele menu
		 */
		Menu menuFile = new Menu("File");
		Menu menuEdit = new Menu("Edit");
		Menu menuHelp = new Menu("Help");
		bar.add(menuFile);
		bar.add(menuEdit);
		/*
		 * por ultimo podemos instaciar os MenuItens,os MenuItem sao adcionados pelo
		 * Menu, cada MenuItem recebe como parametro uuma String que representa a fun��o
		 * daquele menu
		 */
		MenuItem item1 = new MenuItem("Abrir");
		MenuItem item2 = new MenuItem("Salvar");
		MenuItem item3 = new MenuItem("Sair");
		/*
		 * classe que trata os menus, os MenuItens sao tratasdos como botoes atrav�s do
		 * Metodo ActionPerformade()
		 */
		Tratado handler = new Tratado();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		menuFile.add(item1);
		menuFile.add(item2);
		menuFile.addSeparator();
		menuFile.add(item3);
		/* menus de ajuda sao adcionados ao MenuBAr dessa forma */
		bar.setHelpMenu(menuHelp);
		/* o MenuBAr e setado no nosso Frame dessa forma */
		frame.setMenuBar(bar);
		frame.setSize(200, 100);
		frame.setVisible(true);

	}
}

class Tratado implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();// retorna o item selecionado
		System.out.println("Foi acionado o Item de Menu: " + str);
		if (str == "Sair") {
			// System.exit(0);
		}
	}
}
