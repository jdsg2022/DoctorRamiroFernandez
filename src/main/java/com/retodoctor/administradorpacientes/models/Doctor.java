package com.retodoctor.administradorpacientes.models;

import java.util.List;

public class Doctor {
    private int ccDoctor;
    private String nombreCompletoDoctor;
    private String especialidad;
    private List<HorarioDoctor> horarioDisponible;
    private List<CitaMedica> citas;

    public Doctor(int ccDoctor, String nombreCompletoDoctor, String especialidad,
                  List<HorarioDoctor> horarioDisponible, List<CitaMedica> citas) {
        this.ccDoctor = ccDoctor;
        this.nombreCompletoDoctor = nombreCompletoDoctor;
        this.especialidad = especialidad;
        this.horarioDisponible = horarioDisponible;
        this.citas = citas;
    }
    public void aceptarCita(CitaMedica cita) {
        cita.setEstado("aceptada");
    }

    public void cancelarCita(CitaMedica cita) {
        cita.setEstado("cancelada");
    }
    public int getCcDoctor() {
        return ccDoctor;
    }

    public void setCcDoctor(int ccDoctor) {
        this.ccDoctor = ccDoctor;
    }

    public String getNombreCompletoDoctor() {
        return nombreCompletoDoctor;
    }

    public void setNombreCompletoDoctor(String nombreCompletoDoctor) {
        this.nombreCompletoDoctor = nombreCompletoDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<HorarioDoctor> getHorarioDisponible() {
        return horarioDisponible;
    }

    public void setHorarioDisponible(List<HorarioDoctor> horarioDisponible) {
        this.horarioDisponible = horarioDisponible;
    }

    public List<CitaMedica> getCitas() {
        return citas;
    }

    public void setCitas(List<CitaMedica> citas) {
        this.citas = citas;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "ccDoctor=" + ccDoctor +
                ", nombreCompletoDoctor='" + nombreCompletoDoctor + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", horarioDisponible=" + horarioDisponible +
                ", citas=" + citas +
                '}';
    }
}
