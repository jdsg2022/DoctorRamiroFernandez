package com.retodoctor.administradorpacientes.service;

import com.retodoctor.administradorpacientes.models.HistoriaMedica;
import com.retodoctor.administradorpacientes.models.Paciente;

import java.util.List;
import java.util.Set;

public interface IHistoriaMService {
    List<HistoriaMedica> historiasMedicasRegistradas();
    HistoriaMedica agregarHistoriaMedica(HistoriaMedica historiaMedica);
    HistoriaMedica actualizarDatosHM(HistoriaMedica historiaMedica);
}
