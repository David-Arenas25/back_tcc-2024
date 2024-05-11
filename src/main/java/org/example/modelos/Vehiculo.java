package org.example.modelos;

import java.time.LocalDate;

public class Vehiculo {

    Integer id;
    String marca;
    LocalDate modelo;
    Double kilometraje;
    String color;
    String descripcion;
    String tipo;
    Integer autonomia;
    Double capacidadCarga;
    Integer avaluo;


    public Vehiculo(Integer id, String marca, LocalDate modelo, Double kilometraje, String color, String descripcion, String tipo, Integer autonomia, Double capacidadCarga, Integer avaluo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.autonomia = autonomia;
        this.capacidadCarga = capacidadCarga;
        this.avaluo = avaluo;
    }

    public Vehiculo() {


    }
}
