package com.retodoctor.administradorpacientes.service;

import com.retodoctor.administradorpacientes.models.HistoriaMedica;
import com.retodoctor.administradorpacientes.models.Paciente;
import com.retodoctor.administradorpacientes.repository.HMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HistoriaMService implements IHistoriaMService{
    @Autowired
    private HMRepository hmRepository;
    @Override
    public List<HistoriaMedica> historiasMedicasRegistradas() {
        return hmRepository.getListaHmedicas();
    }
    @Override
    public HistoriaMedica agregarHistoriaMedica(HistoriaMedica historiaMedica) {
        HistoriaMedica historiaMedica1 = new HistoriaMedica(historiaMedica.getIdHM(),
                historiaMedica.getDescripcion());
        hmRepository.agregarHistoriaMedica(historiaMedica1);
        return historiaMedica1;
    }

    @Override
    public HistoriaMedica actualizarDatosHM(HistoriaMedica historiaMedica) {
        hmRepository.actualizarHM(historiaMedica);
        return historiaMedica;
    }
}
