package isi.dan.laboratorios.lab01.service;

import isi.dan.laboratorios.lab01.domain.Cliente;

public interface ClienteService {
    
    public Cliente guardarCliente(Cliente c);
    public Cliente bajaCliente(Integer id);
    public Cliente listarClientes();
    public Cliente buscarClientePorId(Integer id);
}
