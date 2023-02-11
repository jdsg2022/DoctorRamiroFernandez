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
        return consultorioRepository.getListaPacientes();
    }

    @Override
    public Paciente agregarPaciente(Paciente paciente) {
        Paciente pacientesRegistrados = new Paciente(
            paciente.getCc(), paciente.getNombreCompleto(),
            paciente.getEdad(), paciente.getFechaNacimiento(),
            paciente.getEstadoCivil(), paciente.getDireccion());
        consultorioRepository.agregarPaciente(pacientesRegistrados);
        return pacientesRegistrados;
    }

    @Override
    public Paciente eliminarPaciente(Paciente paciente) {
        consultorioRepository.eliminarPaciente(paciente);
        return paciente;
    }

    @Override
    public Paciente actualizarDatosPaciente(Paciente paciente) {
        consultorioRepository.actualizarDatos(paciente);
        return paciente;
    }
}
