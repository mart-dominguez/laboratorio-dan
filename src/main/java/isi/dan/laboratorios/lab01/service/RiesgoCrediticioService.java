package isi.dan.laboratorios.lab01.service;

public interface RiesgoCrediticioService {
    
    public Boolean reporteVerazPositivo(String cuit);
    public Boolean reporteBCRAPositivo(String cuit);
    public Boolean reporteAFIPPositivo(String cuit);
}
