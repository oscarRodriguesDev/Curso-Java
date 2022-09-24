package br.com.aed.Eventos_java;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JButton;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class Janela extends Frame {
	/*
	 * para estudarmos eventos vamos primeiramente criar uma janela que vai receber
	 * os componentes para nos quais adcionaremos eventosentao vamos l�;
	 */
	public Janela() {
		super("Estudando eventos");
		setLayout(new GridLayout(4, 2));
		/* adcionando o tratador da janela */
		// addWindowListener(new TrataJanela());
		/* o primeiro elemento ser� o Button */
		Button botao = new Button("primeiro botao");
		/* adcionamos o tratador de botoes ao tao como um ActionListener */
		botao.addActionListener(new TrataBotao());
		/* usando com o JButton da Swing */
		JButton botao1 = new JButton("segundo botao");
		/* adcionamos o tratador de botoes ao tao como um ActionListener */
		botao1.addActionListener(new TrataBotao());
		/*
		 * agora vamos entender mais sobre o evento de mouse qualquer componente pode
		 * receber os eventos de mouse, nesse caso vamos criar um Label e adcionar
		 * eventos de mouse a ele
		 */
		Label evtmouse = new Label("click_me");
		evtmouse.addMouseListener(new TrataMouse());

		/*
		 * vamos adcionar a nossa janela um MouseMotionListener, eventos de movimento do
		 * mouse
		 */
		this.addMouseMotionListener(new TrataMouse1());
		/* VAmos criar um menu e adcionar eventos aos itens deste menu */

		MenuBar bar = new MenuBar();
		Menu menu = new Menu("menu");
		MenuItem item = new MenuItem("sair");
		/*
		 * aqui vamos adcionar os eventos, para tratar menus podemos usar o mesmo tipo
		 * de tratamento para botoes, e ja temos um tratador para botoes entao:
		 */
		item.addActionListener(new TrataBotao());
		menu.add(item);
		bar.add(menu);
		this.setMenuBar(bar);

		/* Eventos ComponentListener, adcionados � janela */
		this.addComponentListener(new EventComponent());

		/* adcionando eventos de teclado */
		System.out.println("pressione teclas e veja resultado");
		// botao.addKeyListener(new TrataTeclado());
		/*
		 * vamos criar um JPasswordFiel e tentar capturar os caracteres nele exibidos
		 */
		JPasswordField jp = new JPasswordField();
		jp.addKeyListener(new TrataTeclado());
		/* eventos de itens */
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c = new Checkbox("aika", cbg, false);
		Checkbox c1 = new Checkbox("nicole", cbg, false);
		Checkbox c2 = new Checkbox("outro", cbg, false);
		/* instancia da classe tratadora de eventos de itens */
		TrataItens ti = new TrataItens();
		/*
		 * aqui adcionamos a classe tratadora de ventos de listener em cada um dos
		 * checkbox
		 */
		c.addItemListener(ti);
		c1.addItemListener(ti);
		c2.addItemListener(ti);
		/* esecute a classe e veja o resultado */
		add(botao);
		add(botao1);
		add(evtmouse);
		add(c);
		add(c1);
		add(c2);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		new Janela();
	}
}
