package com.retodoctor.administradorpacientes.repository;

import com.retodoctor.administradorpacientes.models.HistoriaMedica;

import java.util.ArrayList;
import java.util.List;

public class HMRepository {
    List<HistoriaMedica> listaHmedicas;

    public HMRepository() {
        listaHmedicas = new ArrayList<>();
    }
}
