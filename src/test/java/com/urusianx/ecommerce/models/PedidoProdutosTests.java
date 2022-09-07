package com.urusianx.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PedidoProdutosTests {

	@Test
	void validarPropriedades() {
		
		var pedidoProduto = new PedidoProduto();

		pedidoProduto.setIdProduto(1);
		pedidoProduto.setIdCliente(1);
		pedidoProduto.setValor(33.33);
		pedidoProduto.setQuantidade(2);

		assertEquals(1, pedidoProduto.getIdCliente());
		assertEquals(1, pedidoProduto.getIdProduto());
		assertEquals(33.33, pedidoProduto.getValor());
		assertEquals(2, pedidoProduto.getQuantidade());
	}

	@Test
	void geraCodigoAoSetarNome(){
		
		var produto = new Produto();
		produto.setNome("Bicicleta");

		assertEquals("BIC-9", produto.getCodigo());
	}

	@Test
	void geraCodigoAoSetarCódigo(){
		
		var produto = new Produto();
		produto.setCodigo("TTT-5");
		produto.setNome("Bicicleta");

		assertEquals("TTT-5", produto.getCodigo());
	}

}
