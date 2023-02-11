package com.retodoctor.administradorpacientes.service;

import com.retodoctor.administradorpacientes.models.Paciente;
import com.retodoctor.administradorpacientes.repository.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PacienteService implements IPacienteService{
    @Autowired
    private ConsultorioRepository consultorioRepository;

    @Override
    public Set<Paciente> pacientesRegistrados() {
        return null;
    }

    @Override
    public Paciente agregarPaciente(Paciente paciente) {
        return null;
    }

    @Override
    public Paciente eliminarPaciente(Paciente paciente) {
        return null;
    }
}
