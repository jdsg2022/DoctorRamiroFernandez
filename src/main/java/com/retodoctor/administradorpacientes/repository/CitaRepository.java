package com.retodoctor.administradorpacientes.repository;

import com.retodoctor.administradorpacientes.models.CitaMedica;
import com.retodoctor.administradorpacientes.models.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CitaRepository {
    private List<CitaMedica> listaCitas;
    private List<Doctor> doctor;

    public CitaRepository() {
        listaCitas = new ArrayList<>();
    }
    public void agregarCita(CitaMedica citaMedica, Doctor doctor){
       if (doctor.getHorarioDisponible().contains(citaMedica.getHorario()));
       listaCitas.add(citaMedica);
        throw new RuntimeException("El doctor no está disponible en ese horario");
    }

    public List <CitaMedica> getListaCitas() {
        return listaCitas;
    }

    @Override
    public String toString() {
        return "CitaRepository{" +
                "listaCitas=" + listaCitas +
                '}';
    }
}
