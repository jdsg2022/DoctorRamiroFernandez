package com.retodoctor.administradorpacientes.service;

import com.retodoctor.administradorpacientes.models.CitaMedica;
import com.retodoctor.administradorpacientes.models.Doctor;
import com.retodoctor.administradorpacientes.models.HorarioDoctor;
import com.retodoctor.administradorpacientes.models.Paciente;

import java.util.List;

public interface ICitaService {
    List<CitaMedica> listaCitas();
    CitaMedica agendarCita(CitaMedica citaMedica, Doctor doctor, Paciente paciente, HorarioDoctor horario);
}
