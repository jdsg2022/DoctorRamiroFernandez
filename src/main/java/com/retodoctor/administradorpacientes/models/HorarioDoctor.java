package com.retodoctor.administradorpacientes.models;

import java.time.LocalTime;
import java.util.Date;

public class HorarioDoctor {
    private LocalTime horaInicio;
    private LocalTime horaFinal;

    public HorarioDoctor(LocalTime horaInicio, LocalTime horaFinal) {
        this.horaInicio = LocalTime.of(8,0);
        this.horaFinal = LocalTime.of(18,0);
    }

}
