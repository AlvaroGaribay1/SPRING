package com.primera.ec.service;

import com.primera.ec.model.dto.ClienteDto;
import com.primera.ec.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> listAll();

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete (Cliente cliente);

    boolean existByID (Integer id);
}
