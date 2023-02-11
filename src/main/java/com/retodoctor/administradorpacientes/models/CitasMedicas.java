package com.retodoctor.administradorpacientes.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class CitasMedicas {
    private LocalDate fecha;
    private LocalTime hora;
    private String lugar;
    private List<Paciente> listaPacientes;
    private Doctor doctor;

    public CitasMedicas() {
    }

    public CitasMedicas(LocalDate fecha, LocalTime hora, String lugar,
                        List<Paciente> listaPacientes, Doctor doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.listaPacientes = listaPacientes;
        this.doctor = doctor;
    }
}
