package br.com.aed.Componentes_AWT;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class OutrosComponentes {

	public static void main(String[] args) {
		/* cria��o basica do Frame */
		Frame frame = new Frame("componentes awt");
		frame.setSize(600, 600);
		frame.setVisible(true);
		/* Panel container do Frame, e adcionando-o ao frame */
		Panel panel = new Panel();
		frame.add(panel);
		/*
		 * Vamos ao primeiro componente ainda nao visto, o TextField o TextField � uma
		 * caixa de texto editavel ou nao que pode ou nao retornar algum dado
		 */
		TextField txt = new TextField("my first TextField");
		TextField txt2 = new TextField("my first TextField");
		/* metodos dos TextFields */
		/* altera a cor de fundo do TextField */
		txt.setBackground(null);
		/* altera a cor do texto dentro do TextField */
		txt.setForeground(Color.BLACK);
		/* altera a fonte dentro do TextField */
		txt.setFont(null);
		/* seta o caractere indicado no lugar de qualquer outro que for digitado */
		txt.setEchoChar('*');
		panel.add(txt2);
		panel.add(txt);
		/* mais metodos consulte a documenta��o da classe */
		/*
		 * TextArea � um campo editavel de texto como o text field porem com mais linhas
		 * pode ser instacniado com parametros ou nao os parametros sao as linhass e
		 * colunas que ele vai possuir, o texto apresentado tambem pode ser inicializado
		 * dentro do construtor antes dos parametros das linha e colunas, new
		 * TextArea(String inicial,int linhas, int colunsa);
		 */
		TextArea editor = new TextArea(20, 50);
		editor.setText("meu primeiro TextArea");
		panel.add(editor);
		/*
		 * CheckBox exibe op�~es que podem ser marcadas cada instancia de Checkbox � uma
		 * op��o
		 */
		Checkbox A = new Checkbox("Aika");
		Checkbox B = new Checkbox("Nicole");
		Checkbox C = new Checkbox("joao");
		panel.add(A);
		panel.add(B);
		panel.add(C);
		/*
		 * o checkboxGroup agrupa varios checkbox nesse caso eles devem ser instanciados
		 * da seguinte forma Checkbox(String value, CheckBoxGroup group, boolean
		 * selecionado)
		 */
		CheckboxGroup group = new CheckboxGroup();
		Checkbox D = new Checkbox("Aika", group, true);
		Checkbox E = new Checkbox("Nicole", group, false);
		Checkbox F = new Checkbox("joao", group, false);
		panel.add(D);
		panel.add(E);
		panel.add(F);

		/** Rode a classe e veja o resultado */
	}
}
