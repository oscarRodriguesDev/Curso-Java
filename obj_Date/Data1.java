package br.com.aed.obj_Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data1 {

	/* algo mais sobre datas em java */
	public static void main(String[] args) throws ParseException {

		Calendar N = Calendar.getInstance();

		/* inserindo a data no calendario, ano, mes e dia */

		System.out.println("TESTE" + N.DAY_OF_MONTH);
		/* foram atual de instanciar uma nova data */
		Date data = N.getTime();

		/* impressao da data */
		System.out.println("data " + data);

		/* atrav�s do DateFormat podemos alterar o formato da data em java */
		DateFormat D = DateFormat.getDateInstance();
		/* imprime o formato da data */
		System.out.println(D.format(Calendar.DATE));

		/* formata��o hora */
		D = DateFormat.getTimeInstance();
		System.out.println(D.format(data));
		/* data e hora */
		D = DateFormat.getDateTimeInstance();
		System.out.println(D.format(data));

		/* estilo bem longo de apresentar data */
		D = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(D.format(data) + " full");

		/* estilo longo para apresentar a data */
		D = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(D.format(data) + " long");

		/* estilo medio pra apresentar a data */
		D = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(D.format(data) + " medium");
		/*
		 * lembrando que tenho que ingformar como parametro a data que eu quero formatar
		 */

		/*
		 * converter String em data, basta infomar a data desejada como parametro no
		 * metodo abaixo
		 */
		Date data2 = D.parse("12/01/2015");
		System.out.println(data2);

		/* formato bem simplificado de data */
		SimpleDateFormat L = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(L.format(data));
	}

}
