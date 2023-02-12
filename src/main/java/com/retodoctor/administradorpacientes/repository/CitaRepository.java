package com.retodoctor.administradorpacientes.repository;

import com.retodoctor.administradorpacientes.models.CitaMedica;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CitaRepository {
    private Map<Integer, CitaMedica> listaCitas;

    public CitaRepository() {
        listaCitas = new HashMap<>();
    }
    public void agregarCita(CitaMedica citaMedica){
        listaCitas.put(1,citaMedica);
    }

    public Map<Integer, CitaMedica> getListaCitas() {
        return listaCitas;
    }

    @Override
    public String toString() {
        return "CitaRepository{" +
                "listaCitas=" + listaCitas +
                '}';
    }
}
