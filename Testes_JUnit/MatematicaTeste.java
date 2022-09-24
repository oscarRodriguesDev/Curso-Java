package br.com.aed.Testes_JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.aed.Metodos.Matematica;
/*O Junit e responsavel por teste para meu
 *  programa, � preciso realizar testes diariamente no  
 *  meu programa afim de evitar erros em meus metodos
 *  Para realizar testes pela primeira vez ser� nessa�ario 
 *  importar a biblioteca JUnit
 *  reponsavel por testes*/

public class MatematicaTeste {
	public Matematica M;

	@Before
	public void setUp() throws Exception {
		M = new Matematica();

	}

	@Test
	public void testMaior() {
		/*
		 * o metodo abaixo � ultilizado para testar a classe, nele informamaos o valor
		 * que � esperado
		 */
		assertEquals(12, M.Maior(10, 12));
	}

	@Test
	public void testRaiz() {
		assertEquals(4, M.Raiz(16));
	}

}
