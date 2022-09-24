package br.com.aed.Logica;

public class TiposPrimitivos {
	/** classe destina-se a demonstrar os tipos primitivos da linguagem java */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String str = "valores de texto";
		/* apenas caracteres unicode */
		char c = 'c';
		/* apenas valores logicos true ou false */
		boolean b = false;
		/* valores de 0 a 127 */
		byte by = 127;
		/* valores de 0 a 32767 */
		short sh = 32_767;// podemos separar com underline
		/* valores ate 2.000.000.000 */
		int i = 2_000_000_000;
		/* valores ate 9.000.000.000.000.000.000 */
		long l = 9_000_000_000_000_000_000L;
		/* valores ate 1.7976931348623157E+308 */
		double d = 1.7976931348623157E+308;// IEEE754
		/* cast implicito */
		i = sh;
		/* cast explicito */
		i = (int) l;

	}

}
