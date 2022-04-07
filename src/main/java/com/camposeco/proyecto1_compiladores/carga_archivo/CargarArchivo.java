/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1_compiladores.carga_archivo;

import static com.camposeco.proyecto1_compiladores.carga_archivo.MovilizadorPath.movilizarDatosPath;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Mariano
 */
public class CargarArchivo {
    public static String[] archivosJavaProyecto1;
    public static String[] archivosJavaProyecto2;
    public void leer(File archivo) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Creamos un metodo con parametros archivo y text area que se ingresaran en inicio
        //FileReader leerA = new FileReader(archivo);//ingresamos archivo
        //BufferedReader leerTA = new BufferedReader(leerA);//lector del archivo       
    }
    public void leerProyecto1(JFrame Principal){
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        archivoEleccion.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        archivoEleccion.setAcceptAllFileFilterUsed(false);
        int eleccion = archivoEleccion.showOpenDialog(Principal);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) { 
            File carpetaSeleccionada = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            movilizarDatosPath.setPathProyecto1(carpetaSeleccionada);
        }
    }
    public void leerProyecto2(JFrame Principal){
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        archivoEleccion.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        archivoEleccion.setAcceptAllFileFilterUsed(false);
        int eleccion = archivoEleccion.showOpenDialog(Principal);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) { 
            File carpetaSeleccionada = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            movilizarDatosPath.setPathProyecto2(carpetaSeleccionada);
        }
    }
    public void actualizarListaProyectos(){
        if(movilizarDatosPath.getPathProyecto1()!=null){
            archivosJavaProyecto1= movilizarDatosPath.getPathProyecto1().list();
            for (int i = 0; i < archivosJavaProyecto1.length; i++) {
                archivosJavaProyecto1[i]=movilizarDatosPath.getPathProyecto1()+"\\"+archivosJavaProyecto1[i];
            }
            for (int i = 0; i < archivosJavaProyecto1.length; i++) {
                System.out.println(archivosJavaProyecto1[i]);
            }
        }
        if(movilizarDatosPath.getPathProyecto2()!=null){
            archivosJavaProyecto2= movilizarDatosPath.getPathProyecto2().list();
            for (int i = 0; i < archivosJavaProyecto2.length; i++) {
                archivosJavaProyecto2[i]=movilizarDatosPath.getPathProyecto2()+"\\"+archivosJavaProyecto2[i];
            }
            for (int i = 0; i < archivosJavaProyecto2.length; i++) {
                System.out.println(archivosJavaProyecto2[i]);
            }
        }
    }
    
    
}