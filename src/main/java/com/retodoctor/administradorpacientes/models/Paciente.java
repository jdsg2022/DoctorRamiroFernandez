package com.retodoctor.administradorpacientes.models;

public class Paciente {
    private int cc;
    private String nombreCompleto;
    private int edad;
    private String fechaNacimiento;
    private String estadoCivil;
    private String direccion;

    public Paciente(int cc, String nombreCompleto, int edad,
            String fechaNacimiento, String estadoCivil,
                    String direccion) {
        this.cc = cc;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "cc=" + cc +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
