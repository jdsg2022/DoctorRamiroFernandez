package com.retodoctor.administradorpacientes.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class CitaMedica {
    private Date fecha;
    private LocalTime hora;
    private String lugar;
    private String motivoConsulta;
    private int horaFinalizacion;
    private List<Paciente> listaPacientes;
    private Doctor doctor;

    public CitaMedica(Date fecha, LocalTime hora, String lugar,
                      String motivoConsulta, int horaFinalizacion,
                      List<Paciente> listaPacientes, Doctor doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.motivoConsulta = motivoConsulta;
        this.horaFinalizacion = horaFinalizacion;
        this.listaPacientes = listaPacientes;
        this.doctor = doctor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public int getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(int horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", motivoConsulta='" + motivoConsulta + '\'' +
                ", horaFinalizacion=" + horaFinalizacion +
                ", listaPacientes=" + listaPacientes +
                ", doctor=" + doctor +
                '}';
    }
}
