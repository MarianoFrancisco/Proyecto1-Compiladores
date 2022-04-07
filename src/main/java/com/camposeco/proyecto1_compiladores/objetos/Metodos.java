/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1_compiladores.objetos;

import java.util.ArrayList;

/**
 *
 * @author Mariano
 */
public class Metodos {
    ArrayList<Metodos> array= new ArrayList<Metodos>();
    private String nombreMetodo;
    private String tipoMetodo;
    private ArrayList<Parametros> listaParametros;
    private ArrayList<Variables> variablesMetodos;

    public Metodos(String nombreMetodo, String tipoMetodo, ArrayList<Parametros> listaParametros, ArrayList<Variables> variablesMetodos) {
        this.nombreMetodo = nombreMetodo;
        this.tipoMetodo = tipoMetodo;
        this.listaParametros = listaParametros;
        this.variablesMetodos = variablesMetodos;
    }

    public ArrayList<Variables> getVariablesMetodos() {
        return variablesMetodos;
    }

    public void setVariablesMetodos(ArrayList<Variables> variablesMetodos) {
        this.variablesMetodos = variablesMetodos;
    }
    public String getNombreMetodo() {
        return nombreMetodo;
    }

    public void setNombreMetodo(String nombreMetodo) {
        this.nombreMetodo = nombreMetodo;
    }

    public String getTipoMetodo() {
        return tipoMetodo;
    }

    public void setTipoMetodo(String tipoMetodo) {
        this.tipoMetodo = tipoMetodo;
    }

    public ArrayList<Parametros> getListaParametros() {
        return listaParametros;
    }

    public void setListaParametros(ArrayList<Parametros> listaParametros) {
        this.listaParametros = listaParametros;
    }
    
    
}
