package com.urusianx.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PedidosTests {

	@Test
	void validarPropriedades() {
		
		var pedido = new Pedido();
		var data = LocalDateTime.now();
		pedido.setIdCliente(1);
		pedido.setValorTotal(33.33);
		pedido.setData(data);

		assertEquals(1, pedido.getIdCliente());
		assertEquals(33.33, pedido.getValorTotal());
		assertEquals(data, pedido.getData());
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
