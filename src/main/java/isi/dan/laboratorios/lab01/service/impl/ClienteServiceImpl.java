package isi.dan.laboratorios.lab01.service.impl;

import isi.dan.laboratorios.lab01.domain.Cliente;
import isi.dan.laboratorios.lab01.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {

    @Override
    public Cliente guardarCliente(Cliente c) {
        if(c.getId()!=null && c.getId()>0)
        return null;
    }

    @Override
    public Cliente bajaCliente(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cliente listarClientes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cliente buscarClientePorId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
