package com.retodoctor.administradorpacientes.service;

import com.retodoctor.administradorpacientes.models.CitaMedica;
import com.retodoctor.administradorpacientes.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CitaService implements ICitaService{
    @Autowired
    private CitaRepository citaRepository;
    @Override
    public Map<Integer, CitaMedica> listaCitas() {
        return citaRepository.getListaCitas();
    }
    @Override
    public CitaMedica agendarCita(CitaMedica citaMedica) {
        CitaMedica citaMedica1 = new CitaMedica(citaMedica.getFecha(), citaMedica.getHora(),
                citaMedica.getLugar(), citaMedica.getMotivoConsulta(), citaMedica.getHoraFinalizacion(),
                citaMedica.getListaPacientes(), citaMedica.getDoctor());
        citaRepository.agregarCita(citaMedica1);
        return citaMedica1;
    }
}
