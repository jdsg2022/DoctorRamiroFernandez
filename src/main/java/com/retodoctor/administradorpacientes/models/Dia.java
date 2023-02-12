package com.retodoctor.administradorpacientes.models;

public class Dia {
    private String nombre;

    public Dia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "DiasSemana{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
