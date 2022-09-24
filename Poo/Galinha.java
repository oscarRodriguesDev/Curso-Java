package br.com.aed.Poo;

/*vamos criar o esqueleto de outro objeto, vamos conhecer o construtor, 
 * o construtor possui o mesmo nome da classe quando nao inicializamos
 *  o construtor em uma classe por default ele � criado pelo compilador  */
public class Galinha {
	/* atributos do objeto */
	/*
	 * variavel abaixo � statica(Global), significa que so existe ele em toda a
	 * classe, nao pode ser criada outra com mesmo nome dentro de um metodo, indica
	 * a quantidade de ovos da granja, por ser Global esta variavel pode ser chamada
	 * mesmo senm a inicializa��o do objeto
	 */
	public static int ovos_da_granja;
	/* variavel indicando a quantidade de ovos da galinha */
	public int ovos;

	/*
	 * o construtor abaixo foi criado pelo IDE eclipse presionando-se CTTL + SPACE
	 */
	public Galinha() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * metodo retona uma galinha, assim sendo tendo instanciado um objeto posso
	 * atravaez dele chamar o metodo quantas vezes for nesse�ario
	 */
	public Galinha botar() {
		/* toda vez que o metodo for chamado acrecenta-se um ovo � galinha */
		this.ovos++;
		/* e um ovo ao ovo da granja */
		Galinha.ovos_da_granja++;
		/* retorna um objeto do tipo Galinha */
		return this;
	}

	/*
	 * metodo statico(global) recebe como parametro a quantidade de galinhas da
	 * granja, fun��o e retornar a media dos ovos botados pela galinha
	 */
	public static double mediaovos(int galinhas) {

		return ovos_da_granja / galinhas;
	}
}