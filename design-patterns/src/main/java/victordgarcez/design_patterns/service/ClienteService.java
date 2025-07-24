package victordgarcez.design_patterns.service;

import victordgarcez.design_patterns.model.Cliente;

public  interface ClienteService {
    default Iterable<Cliente> buscarTodos() {
        return null;
    }

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
