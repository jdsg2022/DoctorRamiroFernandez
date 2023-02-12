package com.retodoctor.administradorpacientes.models;

public class HistoriaMedica {
    private int idHM;
    private String descripcion;

    public HistoriaMedica(int idHM, String descripcion) {
        this.idHM = idHM;
        this.descripcion = descripcion;
    }

    public int getIdHM() {
        return idHM;
    }

    public void setIdHM(int idHM) {
        this.idHM = idHM;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "HistoriaMedica{" +
                "idHM=" + idHM +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
