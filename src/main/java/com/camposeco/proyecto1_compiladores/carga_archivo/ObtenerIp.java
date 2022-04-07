/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1_compiladores.carga_archivo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Mariano
 */
public class ObtenerIp {
    public static ObtenerIp obtencionIp = new ObtenerIp();
    public String conseguirIp() throws UnknownHostException{
        InetAddress conseguirIp = InetAddress.getLocalHost();
        String ipLocalPc = conseguirIp.getHostAddress();
        return ipLocalPc;
    }/*
    public void prueba() throws UnknownHostException{
        InetAddress address = InetAddress.getLocalHost();
        String sHostName;
        sHostName = address.getHostName();

        // Cogemos la IP 
        byte[] bIPAddress = address.getAddress();

// IP en formato String
        String sIPAddress = "";

        for (int x = 0; x < bIPAddress.length; x++) {
            // A todos los numeros les anteponemos
            // un punto menos al primero    
            
            sIPAddress += bIPAddress[x] & 255;
            sIPAddress += ".";
            
        }
        sIPAddress= sIPAddress.substring(0,sIPAddress.length()-1);
        // Jugamos con los bytes y cambiamos el bit del signo
        System.out.println(sIPAddress);
    }*/
}
