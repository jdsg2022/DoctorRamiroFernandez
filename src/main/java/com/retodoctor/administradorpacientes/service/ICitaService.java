package com.retodoctor.administradorpacientes.service;

import com.retodoctor.administradorpacientes.models.CitaMedica;
import com.retodoctor.administradorpacientes.models.Doctor;

import java.util.List;

public interface ICitaService {
    List<CitaMedica> listaCitas();
    CitaMedica agendarCita(CitaMedica citaMedica, Doctor doctor);
}
