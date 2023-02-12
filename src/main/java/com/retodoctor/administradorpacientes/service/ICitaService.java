package com.retodoctor.administradorpacientes.service;

import com.retodoctor.administradorpacientes.models.CitaMedica;

import java.util.Map;

public interface ICitaService {
    Map<Integer, CitaMedica> listaCitas();
    CitaMedica agendarCita(CitaMedica citaMedica);
}
