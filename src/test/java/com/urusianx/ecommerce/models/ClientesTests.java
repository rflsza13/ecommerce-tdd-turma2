package com.urusianx.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientesTests {

	@Test
	void validarPropriedades() {
		
		var cliente = new Cliente();

		cliente.setNome("Rafael");
		cliente.setEmail("rafael@teste.com.br");
		cliente.setSenha("123456");
		cliente.setEndereco("rua teste");
		cliente.setNumero("1");
		cliente.setCep("11111-111");
		cliente.setCidade("Capivari");
		cliente.setBairro("Bairro 1");
		cliente.setEstado("SP");
		cliente.setComplemento("casa3");

		assertEquals("Rafael", cliente.getNome());
		assertEquals("rafael@teste.com.br", cliente.getEmail());
		assertEquals("123456", cliente.getSenha());
		assertEquals("rua teste", cliente.getEndereco());
		assertEquals("1", cliente.getNumero());
		assertEquals("11111-111", cliente.getCep());
		assertEquals("Capivari", cliente.getCidade());
		assertEquals("Bairro 1", cliente.getBairro());
		assertEquals("SP", cliente.getEstado());
		assertEquals("casa3", cliente.getComplemento());
	}

}
