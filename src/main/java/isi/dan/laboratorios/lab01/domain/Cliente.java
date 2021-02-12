package isi.dan.laboratorios.lab01.domain;

import io.swagger.annotations.ApiModelProperty;

public class Cliente {
    
    private Integer id;
    private String nombre;
    private String cuit;
    private String mail;

    @ApiModelProperty(notes = "ingresar el celular con codigo de area sin 0 y sin 15")
    private Long celular;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente [celular=" + celular + ", cuit=" + cuit + ", id=" + id + ", mail=" + mail + ", nombre=" + nombre
                + "]";
    }

    
    
}
