package com.retodoctor.administradorpacientes.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class CitaMedica {
    private Date fecha;
    private String estado;
    private LocalTime hora;
    private String lugar;
    private String motivoConsulta;
    private int horaFinalizacion;
    private Paciente paciente;
    private  HorarioDoctor horario;

    public CitaMedica(Date fecha, LocalTime hora, String lugar,
                      String motivoConsulta, int horaFinalizacion,
                      Paciente paciente, HorarioDoctor horario, String estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.motivoConsulta = motivoConsulta;
        this.horaFinalizacion = horaFinalizacion;
        this.paciente = paciente;
        this.horario = horario;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public HorarioDoctor getHorario() {
        return horario;
    }

    public void setHorario(HorarioDoctor horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", motivoConsulta='" + motivoConsulta + '\'' +
                ", horaFinalizacion=" + horaFinalizacion +
                ", paciente=" + paciente +
                ", horario=" + horario +
                '}';
    }
}
