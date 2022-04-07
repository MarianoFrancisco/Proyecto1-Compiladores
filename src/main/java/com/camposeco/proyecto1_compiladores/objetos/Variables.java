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
public class Variables {
    String identificador;
    String tipoVariable;

    public Variables(String identificador, String tipoVariable) {
        this.identificador = identificador;
        this.tipoVariable = tipoVariable;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipoVariable() {
        return tipoVariable;
    }

    public void setTipoVariable(String tipoVariable) {
        this.tipoVariable = tipoVariable;
    }
    
}
