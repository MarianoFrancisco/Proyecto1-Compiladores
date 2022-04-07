/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1_compiladores;
import static com.camposeco.proyecto1_compiladores.carga_archivo.MovilizadorPath.movilizarDatosPath;
import com.camposeco.proyecto1_compiladores.front_end.ClienteVisual;
import com.camposeco.proyecto1_compiladores.front_end.ServidorVisual;
/**
 *
 * @author Mariano
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //iniciamos frame inicio
                new ClienteVisual().setVisible(true);
            }
        });
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //iniciamos frame inicio
                new ServidorVisual().setVisible(true);
            }
        });
        movilizarDatosPath.crearMovilizadorPath();//creamos movilizadores de path
    }
    
}
