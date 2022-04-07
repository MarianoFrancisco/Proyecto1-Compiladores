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
public class Clases {
    String nombreClase;
    ArrayList<Metodos> nombreMetodosClases;
    ArrayList<Variables> variablesClases;

    public Clases(String nombreClase, ArrayList<Metodos> nombreMetodosClases, ArrayList<Variables> variablesClases) {
        this.nombreClase = nombreClase;
        this.nombreMetodosClases = nombreMetodosClases;
        this.variablesClases = variablesClases;
    }
    
    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public ArrayList<Metodos> getNombreMetodosClases() {
        return nombreMetodosClases;
    }

    public void setNombreMetodosClases(ArrayList<Metodos> nombreMetodosClases) {
        this.nombreMetodosClases = nombreMetodosClases;
    }

    public ArrayList<Variables> getVariablesClases() {
        return variablesClases;
    }

    public void setVariablesClases(ArrayList<Variables> variablesClases) {
        this.variablesClases = variablesClases;
    }
    

    
    
    
}
