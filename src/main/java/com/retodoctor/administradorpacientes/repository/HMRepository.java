package com.retodoctor.administradorpacientes.repository;

import com.retodoctor.administradorpacientes.models.HistoriaMedica;
import com.retodoctor.administradorpacientes.models.Paciente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class HMRepository {
    List<HistoriaMedica> listaHmedicas;

    public HMRepository() {
        listaHmedicas = new ArrayList<>(List.of(
                new HistoriaMedica(1,"El paciente necesita estudios mas profundos"),
                new HistoriaMedica(2, "El paciente está mejorando"),
                new HistoriaMedica(3, "Se recomienda al paciente una mejor alimentacion")));
    }
    public void historiaMedica(HistoriaMedica historiaMedica){
        listaHmedicas.add(historiaMedica);
    }
    public void agregarHistoriaMedica(HistoriaMedica historiaMedica){
        listaHmedicas.add(historiaMedica);
    }
    public void actualizarHM(HistoriaMedica historiaMedica){
    }

    public List<HistoriaMedica> getListaHmedicas() {
        return listaHmedicas;
    }

    public void setListaHmedicas(List<HistoriaMedica> listaHmedicas) {
        this.listaHmedicas = listaHmedicas;
    }

    @Override
    public String toString() {
        return "HMRepository{" +
                "listaHmedicas=" + listaHmedicas +
                '}';
    }
}
