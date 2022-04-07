/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1_compiladores.carga_archivo;

import java.io.File;


/**
 *
 * @author Mariano
 */
public class MovilizadorPath {
    private File pathProyecto1;
    private File pathProyecto2;
    public static MovilizadorPath movilizarDatosPath;

    public MovilizadorPath(File pathProyecto1, File pathProyecto2) {
        this.pathProyecto1 = pathProyecto1;
        this.pathProyecto2 = pathProyecto2;
    }

    public File getPathProyecto1() {
        return pathProyecto1;
    }

    public void setPathProyecto1(File pathProyecto1) {
        this.pathProyecto1 = pathProyecto1;
    }

    public File getPathProyecto2() {
        return pathProyecto2;
    }

    public void setPathProyecto2(File pathProyecto2) {
        this.pathProyecto2 = pathProyecto2;
    }

    public static void crearMovilizadorPath(){
        movilizarDatosPath= new MovilizadorPath(null,null);
    }
}
