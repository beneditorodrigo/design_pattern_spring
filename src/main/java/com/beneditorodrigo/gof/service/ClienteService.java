package com.beneditorodrigo.gof.service;

import com.beneditorodrigo.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 *
 * @author beneditorodrigo
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    Cliente inserir(Cliente cliente);

    Cliente atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
