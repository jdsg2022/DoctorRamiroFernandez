package com.retodoctor.administradorpacientes.models;

public class DiasSemana {
    private String Lunes;
    private String Martes;
    private String Miercoles;
    private String Jueves;
    private String Viernes;
    private String Sabado;
    private String Domingo;

    public DiasSemana(String lunes, String martes,
                      String miercoles, String jueves,
                      String viernes, String sabado,
                      String domingo) {
        Lunes = lunes;
        Martes = martes;
        Miercoles = miercoles;
        Jueves = jueves;
        Viernes = viernes;
        Sabado = sabado;
        Domingo = domingo;
    }

    public String getLunes() {
        return Lunes;
    }

    public void setLunes(String lunes) {
        Lunes = lunes;
    }

    public String getMartes() {
        return Martes;
    }

    public void setMartes(String martes) {
        Martes = martes;
    }

    public String getMiercoles() {
        return Miercoles;
    }

    public void setMiercoles(String miercoles) {
        Miercoles = miercoles;
    }

    public String getJueves() {
        return Jueves;
    }

    public void setJueves(String jueves) {
        Jueves = jueves;
    }

    public String getViernes() {
        return Viernes;
    }

    public void setViernes(String viernes) {
        Viernes = viernes;
    }

    public String getSabado() {
        return Sabado;
    }

    public void setSabado(String sabado) {
        Sabado = sabado;
    }

    public String getDomingo() {
        return Domingo;
    }

    public void setDomingo(String domingo) {
        Domingo = domingo;
    }
}
