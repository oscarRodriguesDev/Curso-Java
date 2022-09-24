package br.com.aed.Testes_JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.aed.Conhecimento_Avançado.Recursao;

//import refinado.Recursao;

public class RecursaoTeste {

	@Before
	public void setUp() throws Exception {
	}

	/* neste teste é realizada a mesma, coisa porem com outra classe */
	@Test
	public void testSoma() {

		assertEquals(21, Recursao.soma(6));
	}

	@Test
	public void testPotencia() {
		assertEquals(25, Recursao.Potencia(5, 2));
	}

	@Test
	public void testSubtrai() {
		assertEquals(5, Recursao.subtrai(9));
	}

}
