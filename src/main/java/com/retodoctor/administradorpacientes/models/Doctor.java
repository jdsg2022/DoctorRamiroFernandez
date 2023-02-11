package com.retodoctor.administradorpacientes.models;

public class Doctor {
    private int ccDoctor;
    private String nombreCompletoDoctor;
    private String especialidad;

    public Doctor(int ccDoctor, String nombreCompletoDoctor, String especialidad) {
        this.ccDoctor = ccDoctor;
        this.nombreCompletoDoctor = nombreCompletoDoctor;
        this.especialidad = especialidad;
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

    @Override
    public String toString() {
        return "Doctor{" +
                "ccDoctor=" + ccDoctor +
                ", nombreCompletoDoctor='" + nombreCompletoDoctor + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
