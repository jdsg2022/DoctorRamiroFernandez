package com.retodoctor.administradorpacientes.models;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class HorarioDoctor {
    private LocalTime horaInicio;
    private LocalTime horaFinal;

    public HorarioDoctor(LocalTime horaInicio, LocalTime horaFinal) {
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }
}
