package com.urusianx.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.urusianx.ecommerce.models.Cliente;

@Repository
interface IClientesDAO extends CrudRepository<Cliente, Integer> {
        
}
