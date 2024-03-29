package com.retodoctor.administradorpacientes.repository;

import com.retodoctor.administradorpacientes.models.Paciente;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class ConsultorioRepository {
    private final String nombre;
    private Set<Paciente> listaPacientes;

    public ConsultorioRepository() {
        this.nombre = "Consultorio Ramiro Fernandez";
        listaPacientes = new HashSet<>(Set.of(
                new Paciente(1011546787,"Mario Ortiz",34,"12/9/1988","casado","cll 10 # 45-24"),
                new Paciente(1120345434,"Mariana Salazar",25,"12/9/1995","soltera","cll 30 # 23-22"),
                new Paciente(1034234543,"Claudia Lopez",45,"12/9/1981","viuda","crr 50 # 41-14")));
    }
    public void agregarPaciente(Paciente paciente){
        listaPacientes.add(paciente);
    }
    public void eliminarPaciente(Paciente paciente){
        listaPacientes.remove(paciente);
    }
    public void actualizarDatos(Paciente paciente){
    }

    public Set<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(Set<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    @Override
    public String toString() {
        return "ConsultorioRepository{" +
                "nombre='" + nombre + '\'' +
                ", listaPacientes=" + listaPacientes +
                '}';
    }
}
