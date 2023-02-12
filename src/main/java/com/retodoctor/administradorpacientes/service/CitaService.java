package com.retodoctor.administradorpacientes.service;

import com.retodoctor.administradorpacientes.models.CitaMedica;
import com.retodoctor.administradorpacientes.models.Doctor;
import com.retodoctor.administradorpacientes.models.HorarioDoctor;
import com.retodoctor.administradorpacientes.models.Paciente;
import com.retodoctor.administradorpacientes.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CitaService implements ICitaService{
    @Autowired
    private CitaRepository citaRepository;
    @Override
    public List<CitaMedica> listaCitas() {
        return citaRepository.getListaCitas();
    }

    @Override
    public CitaMedica agendarCita(CitaMedica citaMedica, Doctor doctor, Paciente paciente, HorarioDoctor horario) {
        CitaMedica citaMedica1 = new CitaMedica(citaMedica.getFecha(), citaMedica.getHora(),
                citaMedica.getLugar(), citaMedica.getMotivoConsulta(),
                citaMedica.getHoraFinalizacion(), citaMedica.getPaciente(),
                citaMedica.getHorario(), citaMedica.getEstado());
        citaRepository.agregarCita(citaMedica1, doctor);
        return citaMedica1;
    }
}
