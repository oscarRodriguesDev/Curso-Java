package br.com.aed.Conhecimento_Avan�ado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImpressaoJava implements Printable {
	/**
	 * Esta classe tem como objetivo demonstrar uma forma de ultilizar a impressora
	 * atravez da linguagem java, o primriro passo � implementar a interface
	 * Printable
	 */
	JPanel panel;

	/** Construtor aqui recebe o componente JPanel que ser� impresso */

	public ImpressaoJava(JPanel panel) {
		this.panel = panel;
		// chamada do metodo imprimir
		imprimir();
	}

	/** Metodo imprimir aqui � o verdadeiro responsavel pela impressao */
	public void imprimir() {
		// instanciamos uma PrinterJob
		PrinterJob job = PrinterJob.getPrinterJob();
		/*
		 * o metodo printDialog retorna um booleano caso tudo esteja correndo certo
		 */
		boolean ok = job.printDialog();
		/*
		 * o metodo setPrintable recebe a classe Implementada pela interface Printable,
		 * pois somente esta classe pode ser usada para imprimir
		 */
		job.setPrintable(this);
		/* caso o retorno seja true continuamos a impressao */
		if (ok) {
			try {
				/*
				 * Este metodo lanca excessoes e vamos tratalas aqui atravez do try catch
				 */
				job.print();
			} catch (PrinterException e) {
				// apenas imprimimos a Exception
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		/* vamos criar o JFrame que vai receber o JPanel que ser� impresso */
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		frame.add(panel, BorderLayout.CENTER);
		panel.add(new JLabel("Teste Impressao"));
		frame.setVisible(true);
		new ImpressaoJava(panel);
	}

	/*
	 * este � o metodo implementado pela Interface Printable, recebe um objeto tipo
	 * Graphics, um objeto tipo PgeFormate um inteiro informando o nuymero de
	 * paginas, este metodo retorna um inteiro
	 */
	@Override
	public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
		if (page > 0) {
			return Printable.NO_SUCH_PAGE;
		}
		Graphics2D g2D = (Graphics2D) g;
		g2D.translate(pf.getImageableX(), pf.getImageableY());
		panel.printAll(g);
		return Printable.PAGE_EXISTS;
	}
	// estudar uma forma de imprimir os dados da ficha nesse�arios para o
	// visitador
}
