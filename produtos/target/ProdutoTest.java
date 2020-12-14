package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

public class ProdutoTest {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Produto bala = new Produto("juquinha", 0.10);
		assertEquals(0.11, bala.getPrecoComImposto());
	}

}
