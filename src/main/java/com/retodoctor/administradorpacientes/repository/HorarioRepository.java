package com.retodoctor.administradorpacientes.repository;

import com.retodoctor.administradorpacientes.models.Dia;
import com.retodoctor.administradorpacientes.models.HorarioDoctor;

import java.util.ArrayList;
import java.util.List;

public class HorarioRepository {
    List<Dia> diasSemana;
    HorarioDoctor horario;

    public HorarioRepository() {
        this.horario = horario;
        diasSemana = new ArrayList<>(List.of(new Dia("LUNES"),
                new Dia("MARTES"),new Dia("MIERCOLES"),
                new Dia("JUEVES"),new Dia("VIERNES"),
                new Dia("SABADO")));
    }
}
