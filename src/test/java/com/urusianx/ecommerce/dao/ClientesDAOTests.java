package com.urusianx.ecommerce.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientesDAOTests {

	@Autowired
	private IClientesDAO clientesDAO;

	@Test
	void validarFindDoDaoCliente() {
		assertEquals(0, clientesDAO.count());
	}

	@Test
	void validarSeEmailExiste(){
		var clienteNaoExiste = clientesDAO.emailExiste("dd@teste.com,br");
	}

}
