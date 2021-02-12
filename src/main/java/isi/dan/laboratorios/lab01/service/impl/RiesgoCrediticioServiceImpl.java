package isi.dan.laboratorios.lab01.service.impl;

import isi.dan.laboratorios.lab01.service.RiesgoCrediticioService;

public class RiesgoCrediticioServiceImpl implements RiesgoCrediticioService {

    @Override
    public Boolean reporteVerazPositivo(String cuit) {
        return true;
    }

    @Override
    public Boolean reporteBCRAPositivo(String cuit) {
        return true;
    }

    @Override
    public Boolean reporteAFIPPositivo(String cuit) {
        return true;
    }
    
}
