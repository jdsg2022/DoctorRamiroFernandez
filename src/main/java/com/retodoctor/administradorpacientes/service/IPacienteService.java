package com.retodoctor.administradorpacientes.service;

import com.retodoctor.administradorpacientes.models.Paciente;

import java.util.Set;

public interface IPacienteService {
    Set<Paciente> pacientesRegistrados();
    Paciente agregarPaciente(Paciente paciente);
    Paciente eliminarPaciente(Paciente paciente);

}
