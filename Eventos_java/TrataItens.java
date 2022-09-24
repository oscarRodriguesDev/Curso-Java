package br.com.aed.Eventos_java;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*Esta classe se destina a tratar eventos de itens ou seja 
 * onde o usuario pode escolhher ou mais itens de uyma lista*/
public class TrataItens implements ItemListener {

	/* Metodo tratador descrito abaixo */
	@Override
	public void itemStateChanged(ItemEvent i) {

		/* vamos apenas imprimir o valor selecionado pelo usuario */

		System.out.println(i.getItem().toString());// esta linha é o suficiente
													// para imprimir o valor
													// selecionado

	}

}
