package br.com.aed.Info_System;

import java.awt.Dimension;
import java.awt.Toolkit;

public class TamanhoTela {
	/* classe destina-se a retornar o tamnho da janela do usuario */
	public static void main(String[] args) {
		/*
		 * o getDefaultToolkit().getScreenSize retorna um objeto Dimension, atraves do
		 * objeto Dimension, chamamos o atributo width e o atributo heigth que trazem a
		 * largura e a altura da tela em pixeis
		 */
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(
				"O tamanho da tela �: " + dim.width + " pixels de largura por " + dim.height + " pixels de altura.");

	}

}
