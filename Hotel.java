/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examentercera;

/**
 *
 * @author DAW
 */
public class Hotel implements Comparable<Hotel> {
      //hola estoy modificando un archivo
    private final String Nombre;
    private final String cadena;
    private final String Ubicacion;
    private final int capacidad;
    private int huespedes = 0;

    public Hotel(String Nombre, String cadena, String Ubicacion, int capacidad) {
        this.Nombre = Nombre;
        this.cadena = cadena;




        this.Ubicacion = Ubicacion;
        this.capacidad = capacidad;
    }
      // modificacion  ultima
    public String getNombre() {
        return Nombre;
    }

    public String getCadena() {
        return cadena;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    

    public boolean hayEspacio(int n) {

        if (n < (this.capacidad - huespedes)) {

            this.huespedes += n;

            System.out.println("La reserva is done");

            return true;

        }

        return false;

    }

    public void reservar(int n) throws ImposibleReservarException {

        if (n < (this.capacidad - huespedes)) {

            this.huespedes += n;

            System.out.println("La reserva is done");

        } else {

            throw new ImposibleReservarException(" No disponemos de reservas para " + n + " personas ");

        }

    }

    public void añadirHuespedes(int n) {

        this.huespedes += n;

    }

    public boolean equals(Object o) {

        Hotel c = (Hotel) o;

        if (this.Nombre.equals(c.getNombre())) {

            return true;
        }

        return false;

    }

    public int compareTo(Hotel o) {

        return this.Nombre.compareTo(o.Nombre);

    }

    public String escribir() {

        return this.Nombre;

    }

}
