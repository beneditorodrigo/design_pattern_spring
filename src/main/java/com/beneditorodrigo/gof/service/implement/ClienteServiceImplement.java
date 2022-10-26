package com.beneditorodrigo.gof.service.implement;

import com.beneditorodrigo.gof.model.Cliente;
import com.beneditorodrigo.gof.model.ClienteRepository;
import com.beneditorodrigo.gof.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImplement implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public Cliente inserir(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente atualizar(Long id, Cliente cliente) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }
}
