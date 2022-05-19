/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacesvisuales.DemoInterface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ruben <3886114@alu.murcieduca.es>
 */
public class EjemploEventos {

    public static void main(String[] args) {
  
        VentanaDemo v = new VentanaDemo();
           System.out.println("hola ruben");
        
    }

}

class VentanaDemo extends JFrame {

    public VentanaDemo() {

        super("titulo de la ventana");
        setSize(640, 480); // tamaño del frame
        setLocation(300, 600); //Localizacion de la pantalla,
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // siempre para cerrar el programa.
        setVisible(true);
        setResizable(false);
        //panel con dos botones
        Mipanel panel = new Mipanel();
        JButton botonA = new JButton("Azul");
        panel.add(botonA);
        //Añado al panel
        add(panel);
        //Re3gistramos los eventos asocioados a los botones
        botonA.addActionListener(panel);
        JButton botonR = new JButton("Rojo");
        panel.add(botonR);

        botonR.addActionListener(panel);//Le pasamos el objetro panel ya que implemtna el metodo actionListener      

    }

}

class Mipanel extends JPanel implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        String opcion = e.getActionCommand();
        if (opcion.equals("Azul")) {
            this.setBackground(Color.BLUE);
        } else if (opcion.equals("Rojo")) {
            this.setBackground(Color.red);
        }

    }

}
