package com.retodoctor.administradorpacientes.models;

public class Paciente {
    private int cc;
    private String nombreCompleto;
    private String direccion;

    public Paciente() {
    }

    public Paciente(int cc, String nombreCompleto, String direccion) {
        this.cc = cc;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "cc=" + cc +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
