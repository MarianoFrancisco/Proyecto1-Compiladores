/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1_compiladores.objetos;

/**
 *
 * @author Mariano
 */
public class Parametros {
    private String nombreParametro;
    private String tipoParametro;
    
    public Parametros(String nombreParametro, String tipoParametro) {
        this.nombreParametro = nombreParametro;
        this.tipoParametro = tipoParametro;
    }
    
    public String getNombreParametro() {
        return nombreParametro;
    }

    public void setNombreParametro(String nombreParametro) {
        this.nombreParametro = nombreParametro;
    }

    public String getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(String tipoParametro) {
        this.tipoParametro = tipoParametro;
    }
    
}
