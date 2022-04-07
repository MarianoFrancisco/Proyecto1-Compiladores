/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1_compiladores.front_end;

import com.camposeco.proyecto1_compiladores.carga_archivo.CargarArchivo;
import static com.camposeco.proyecto1_compiladores.carga_archivo.CargarArchivo.archivosJavaProyecto1;
import static com.camposeco.proyecto1_compiladores.carga_archivo.CargarArchivo.archivosJavaProyecto2;
import static com.camposeco.proyecto1_compiladores.carga_archivo.MovilizadorPath.movilizarDatosPath;
import static com.camposeco.proyecto1_compiladores.carga_archivo.ObtenerIp.obtencionIp;
import static com.camposeco.proyecto1_compiladores.front_end.ServidorVisual.CargaArchivo;
import static com.camposeco.proyecto1_compiladores.front_end.ServidorVisual.datos;
import java.awt.Graphics;
import java.awt.Image;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class ClienteVisual extends javax.swing.JFrame {

    /**
     * Creates new form ClienteVisual
     */
    public CargarArchivo cargaArchivo = new CargarArchivo();
    ArrayList<String[]> proyectos = new ArrayList<>();
    public ClienteVisual() {
        initComponents();//iniciar componentes
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/FondoAnalizador.jpg"));
        Image image = icon.getImage();
        escritorio1 = new javax.swing.JDesktopPane(){public void paintComponent(Graphics g){ g.drawImage(image,0,0,getWidth(),getHeight(),this);
        }
    };
    cargarProyecto1 = new javax.swing.JButton();
    enviarProyectosServidor = new javax.swing.JButton();
    txtAreaCarga = new javax.swing.JLabel();
    cargarProyecto2 = new javax.swing.JButton();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Analizador USAC");

    cargarProyecto1.setBackground(new java.awt.Color(255, 255, 0));
    cargarProyecto1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
    cargarProyecto1.setForeground(new java.awt.Color(0, 0, 0));
    cargarProyecto1.setText("Cargar proyecto 1");
    cargarProyecto1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cargarProyecto1ActionPerformed(evt);
        }
    });

    enviarProyectosServidor.setBackground(new java.awt.Color(0, 255, 204));
    enviarProyectosServidor.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
    enviarProyectosServidor.setForeground(new java.awt.Color(0, 0, 0));
    enviarProyectosServidor.setText("Enviar proyectos a servidor");
    enviarProyectosServidor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            enviarProyectosServidorActionPerformed(evt);
        }
    });

    txtAreaCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/areaCarga.png"))); // NOI18N

    cargarProyecto2.setBackground(new java.awt.Color(255, 255, 0));
    cargarProyecto2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
    cargarProyecto2.setForeground(new java.awt.Color(0, 0, 0));
    cargarProyecto2.setText("Cargar proyecto 2");
    cargarProyecto2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cargarProyecto2ActionPerformed(evt);
        }
    });

    escritorio1.setLayer(cargarProyecto1, javax.swing.JLayeredPane.DEFAULT_LAYER);
    escritorio1.setLayer(enviarProyectosServidor, javax.swing.JLayeredPane.DEFAULT_LAYER);
    escritorio1.setLayer(txtAreaCarga, javax.swing.JLayeredPane.DEFAULT_LAYER);
    escritorio1.setLayer(cargarProyecto2, javax.swing.JLayeredPane.DEFAULT_LAYER);

    javax.swing.GroupLayout escritorio1Layout = new javax.swing.GroupLayout(escritorio1);
    escritorio1.setLayout(escritorio1Layout);
    escritorio1Layout.setHorizontalGroup(
        escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(escritorio1Layout.createSequentialGroup()
            .addGap(52, 52, 52)
            .addComponent(cargarProyecto1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
            .addComponent(cargarProyecto2)
            .addGap(89, 89, 89))
        .addGroup(escritorio1Layout.createSequentialGroup()
            .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorio1Layout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(txtAreaCarga))
                .addGroup(escritorio1Layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(enviarProyectosServidor)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    escritorio1Layout.setVerticalGroup(
        escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(escritorio1Layout.createSequentialGroup()
            .addComponent(txtAreaCarga)
            .addGap(18, 18, 18)
            .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cargarProyecto1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cargarProyecto2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(64, 64, 64)
            .addComponent(enviarProyectosServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(378, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Inicio", escritorio1);

    jMenu1.setText("File");
    jMenuBar1.add(jMenu1);

    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarProyecto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarProyecto1ActionPerformed
        cargaArchivo.leerProyecto1(this);
    }//GEN-LAST:event_cargarProyecto1ActionPerformed

    private void enviarProyectosServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarProyectosServidorActionPerformed
        cargaArchivo.actualizarListaProyectos();
        
        if(movilizarDatosPath.getPathProyecto1()!=null&&movilizarDatosPath.getPathProyecto2()!=null){
            try {
                proyectos.add(archivosJavaProyecto1);
                proyectos.add(archivosJavaProyecto2);
                Socket socketCliente = new Socket(obtencionIp.conseguirIp(),10001);
                ObjectOutputStream listaProyectoEnviar = new ObjectOutputStream(socketCliente.getOutputStream());
                listaProyectoEnviar.writeObject(proyectos);
                listaProyectoEnviar.close();
                socketCliente.close();
                proyectos.clear();
                CargaArchivo.setText("");
                datos.setText("");
        } catch (IOException ex) {
            Logger.getLogger(ClienteVisual.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(null, "No has abierto los dos proyectos necesarios");
        }
    }//GEN-LAST:event_enviarProyectosServidorActionPerformed

    private void cargarProyecto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarProyecto2ActionPerformed
        cargaArchivo.leerProyecto2(this);
    }//GEN-LAST:event_cargarProyecto2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarProyecto1;
    private javax.swing.JButton cargarProyecto2;
    private javax.swing.JButton enviarProyectosServidor;
    private javax.swing.JDesktopPane escritorio1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtAreaCarga;
    // End of variables declaration//GEN-END:variables
}
