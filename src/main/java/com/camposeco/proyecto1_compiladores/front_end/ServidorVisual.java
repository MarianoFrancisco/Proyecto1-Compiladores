/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1_compiladores.front_end;

import com.camposeco.proyecto1_compiladores.analizador.lexer.parteLexicaJava;
import com.camposeco.proyecto1_compiladores.analizador.parser.SintacticoParserJava;
import com.camposeco.proyecto1_compiladores.carga_archivo.CargarArchivo;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author Mariano
 */
public class ServidorVisual extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form Principal
     */
    ArrayList<String[]> proyectos;
    private parteLexicaJava lexico;
    private SintacticoParserJava sintactico;
    public static String[] listaProyecto1;
    public static String[] listaProyecto2;
    public CargarArchivo cargaArchivo = new CargarArchivo();
    public ServidorVisual() {
        initComponents();//iniciar componentes
        Dimension servidorVisual = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) servidorVisual.getWidth()-getWidth(),0 );
        estancia(filaA3,columnaA3,CargaArchivo);
        Thread hiloServidor = new Thread(this);
        hiloServidor.start();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/FondoAnalizador.jpg"));
        Image image = icon.getImage();
        escritorio1 = new javax.swing.JDesktopPane(){public void paintComponent(Graphics g){ g.drawImage(image,0,0,getWidth(),getHeight(),this);
        }
    };
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    jScrollPane2 = new javax.swing.JScrollPane();
    CargaArchivo = new javax.swing.JTextArea();
    jPanel6 = new javax.swing.JPanel();
    columnaA3 = new javax.swing.JLabel();
    filaA3 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    columnaA4 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Analizador USAC");

    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane1.setViewportView(jTextArea1);

    CargaArchivo.setColumns(20);
    CargaArchivo.setRows(5);
    jScrollPane2.setViewportView(CargaArchivo);

    jPanel6.setBackground(new java.awt.Color(51, 204, 255));

    columnaA3.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
    columnaA3.setForeground(new java.awt.Color(0, 0, 0));
    columnaA3.setText("Columna actual: 1");

    filaA3.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
    filaA3.setForeground(new java.awt.Color(0, 0, 0));
    filaA3.setText("Fila actual: 1");

    jLabel9.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(0, 0, 0));
    jLabel9.setText("Información texto cargado");

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(filaA3))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(columnaA3)))
            .addContainerGap(18, Short.MAX_VALUE))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
            .addComponent(jLabel9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(filaA3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(columnaA3)
            .addContainerGap(16, Short.MAX_VALUE))
    );

    columnaA4.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
    columnaA4.setForeground(new java.awt.Color(0, 0, 0));
    columnaA4.setText("Consola:");

    escritorio1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
    escritorio1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
    escritorio1.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
    escritorio1.setLayer(columnaA4, javax.swing.JLayeredPane.DEFAULT_LAYER);

    javax.swing.GroupLayout escritorio1Layout = new javax.swing.GroupLayout(escritorio1);
    escritorio1.setLayout(escritorio1Layout);
    escritorio1Layout.setHorizontalGroup(
        escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(escritorio1Layout.createSequentialGroup()
            .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorio1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 25, Short.MAX_VALUE))
                .addGroup(escritorio1Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(columnaA4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    escritorio1Layout.setVerticalGroup(
        escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(escritorio1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(columnaA4))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(69, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Analizador", escritorio1);

    jMenu1.setText("File");
    jMenuBar1.add(jMenu1);

    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane1)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CargaArchivo;
    private javax.swing.JLabel columnaA;
    private javax.swing.JLabel columnaA1;
    private javax.swing.JLabel columnaA2;
    private javax.swing.JLabel columnaA3;
    private javax.swing.JLabel columnaA4;
    private javax.swing.JDesktopPane escritorio1;
    private javax.swing.JLabel filaA;
    private javax.swing.JLabel filaA1;
    private javax.swing.JLabel filaA2;
    private javax.swing.JLabel filaA3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            ServerSocket socketServidor = new ServerSocket(10001);
            while(true){
            Socket socketCliente=socketServidor.accept();
            ObjectInputStream proyectosEntrada= new ObjectInputStream(socketCliente.getInputStream());
            //DataInputStream proyectosEntrada= new DataInputStream(socketCliente.getInputStream());
            proyectos=(ArrayList<String[]>) proyectosEntrada.readUnshared();
            listaProyecto1 = proyectos.get(0);
            listaProyecto2 = proyectos.get(1);
                System.out.println("leemos archivo 1");
            for (int i = 0; i < listaProyecto1.length; i++) {
            }
            for (int i = 0; i < listaProyecto1.length; i++) {
                analisis(listaProyecto1[i]);
            }
                System.out.println("leemos archivo 2");
                for (int i = 0; i < listaProyecto2.length; i++) {
            }
            
            for (int i = 0; i < listaProyecto2.length; i++) {
                analisis(listaProyecto2[i]);
            }
            socketCliente.close();}
        } catch (IOException ex) {
            Logger.getLogger(ServidorVisual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServidorVisual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void analisis(String lista) throws FileNotFoundException, IOException{
        FileReader leerA = new FileReader(lista);//ingresamos archivo
        BufferedReader leerTA = new BufferedReader(leerA);//lector del archivo
        String linea;
        String a ="";
        while ((linea = leerTA.readLine()) != null) {//O(n)
                        a=a+linea+"\n";
        } 
        Reader reader = new StringReader(a);
        lexico = new parteLexicaJava(reader);
        sintactico= new SintacticoParserJava(lexico);
        
        try {
            //sumasParser.parse();  
            sintactico.parse();
            if (sintactico.getClases().size()>0) {
                for (int i = 0; i < sintactico.getClases().size(); i++) {
                    System.out.println("*Vemos clases*");
                    System.out.println(sintactico.getClases().get(i).getNombreClase());
                    if (sintactico.getClases().get(i).getNombreMetodosClases().size()>0) {
                        System.out.println("*Vemos metodos*");
                        for (int j = 0; j < sintactico.getClases().get(i).getNombreMetodosClases().size(); j++) {
                            if (sintactico.getClases().get(i).getNombreMetodosClases().get(j).getListaParametros().size()>0) {
                                System.out.println("*Vemos parametros*");
                                for (int k = 0; k < sintactico.getClases().get(i).getNombreMetodosClases().get(j).getListaParametros().size(); k++) {
                                    System.out.println(sintactico.getClases().get(i).getNombreMetodosClases().get(j).getListaParametros().get(k).getNombreParametro());
                                    System.out.println(sintactico.getClases().get(i).getNombreMetodosClases().get(j).getListaParametros().get(k).getTipoParametro());
                                }
                            }else{
                                System.out.println("no tiene parametros de metodo");
                            }
                            System.out.println(sintactico.getClases().get(i).getNombreMetodosClases().get(j).getNombreMetodo());
                            System.out.println(sintactico.getClases().get(i).getNombreMetodosClases().get(j).getTipoMetodo());
                            if (sintactico.getClases().get(i).getNombreMetodosClases().get(j).getVariablesMetodos().size()>0) {
                                System.out.println("*Vemos variables metodos*");
                                for (int k = 0; k < sintactico.getClases().get(i).getNombreMetodosClases().get(j).getVariablesMetodos().size(); k++) {
                                    System.out.println(sintactico.getClases().get(i).getNombreMetodosClases().get(j).getVariablesMetodos().get(k).getIdentificador());
                                    System.out.println(sintactico.getClases().get(i).getNombreMetodosClases().get(j).getVariablesMetodos().get(k).getTipoVariable());
                                }
                            }else{
                                System.out.println("no tiene variables de metodo");
                            }
                        }
                    }else{
                        System.out.println("No se encontraron metodos en la clase");
                    }
                    if (sintactico.getClases().get(i).getVariablesClases().size()>0) {
                        System.out.println("*Vemos variables clases*");
                       for (int j = 0; j < sintactico.getClases().get(i).getVariablesClases().size(); j++) {
                            System.out.println(sintactico.getClases().get(i).getVariablesClases().get(j).getIdentificador());
                            System.out.println(sintactico.getClases().get(i).getVariablesClases().get(j).getTipoVariable());
                        }
                    }else{
                        System.out.println("No se encontraron variables de clase");
                    }
                    System.out.println("-----------Comentarios");
                    if (lexico.getComentarios().size()>0) {
                        for (int j = 0; j < lexico.getComentarios().size(); j++) {
                            System.out.println(lexico.getComentarios().get(j));
                        }
                    }
                    if (sintactico.getErrorSintactico().size()>0) {
                        for (int j = 0; j < sintactico.getErrorSintactico().size(); j++) {
                            CargaArchivo.setText(CargaArchivo.getText()+sintactico.getErrorSintactico().get(i));
                        }
                        
                    }
                    if (lexico.getErrorLexico().size()>0) {
                        for (int j = 0; j < sintactico.getErrorSintactico().size(); j++) {
                            CargaArchivo.setText(CargaArchivo.getText()+lexico.getErrorLexico().get(j));
                        }
                    }
                }
                
            }else{
                System.out.println("Clase no encontrada en este archivo");
            }
            
            /*System.out.println(sintactico.getMetodos().get(0).getNombreMetodo());
            System.out.println(sintactico.getMetodos().get(0).getTipoMetodo());
            System.out.println(sintactico.getMetodos().get(0).getListaParametros().get(0).getNombreParametro());
            System.out.println(sintactico.getMetodos().get(0).getListaParametros().get(1).getNombreParametro());
            System.out.println(sintactico.getMetodos().get(0).getListaParametros().get(0).getTipoParametro());
            System.out.println(sintactico.getMetodos().get(0).getListaParametros().get(1).getTipoParametro());
            System.out.println(sintactico.getMetodos().get(1).getNombreMetodo());
            System.out.println(sintactico.getMetodos().get(1).getTipoMetodo());
            System.out.println(sintactico.getMetodos().get(1).getListaParametros().get(0).getNombreParametro());
            System.out.println(sintactico.getMetodos().get(1).getListaParametros().get(1).getNombreParametro());
            System.out.println(sintactico.getMetodos().get(1).getListaParametros().get(0).getTipoParametro());
            System.out.println(sintactico.getMetodos().get(1).getListaParametros().get(1).getTipoParametro());*/
        } catch (Exception e) {
            e.printStackTrace();
            // Aqui ustedes manejan de forma correcta el error.
        }
        
    }public void estancia(JLabel filaA,JLabel columnaA,JTextArea carga){
        carga.addCaretListener(new CaretListener() {//para ver la posicion
            @Override
            public void caretUpdate(CaretEvent e) {//caret es para verificar si hay cambio click
                JTextArea editar = (JTextArea) e.getSource();
                int filaActual = 1,columnaReciente=1;
                try {
                    int caretpos = editar.getCaretPosition();// editamos el área
                    filaActual = editar.getLineOfOffset(caretpos);
                    //columna debe ser 1 al inicio
                    columnaReciente = caretpos - editar.getLineStartOffset(filaActual)+1;
                    filaActual += 1;//cuando avance un se le sumara uno a la linea
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

                //reevisamos nuevamente
                filaA.setText("FILA ACTUAL: "+filaActual);
                columnaA.setText("COLUMNA ACTUAL: "+columnaReciente);
            }
        });
    }
}
