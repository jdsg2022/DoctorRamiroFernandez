package com.retodoctor.administradorpacientes.crontrollers;

import com.retodoctor.administradorpacientes.models.Paciente;
import com.retodoctor.administradorpacientes.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest")
public class PacienteController {
    @Autowired
    private IPacienteService iPacienteService;

    @GetMapping("bring/paciente")
    public ResponseEntity pacientesInscritos(){
        return new ResponseEntity(iPacienteService.pacientesRegistrados(), HttpStatus.FOUND);
    }
    @PostMapping("add/paciente")
    public ResponseEntity agregarPacientes(@RequestBody Paciente paciente){
        return new ResponseEntity(iPacienteService.agregarPaciente(paciente), HttpStatus.CREATED);
    }
    @DeleteMapping("remove/paciente")
    public ResponseEntity eliminarPacientes(@RequestBody Paciente paciente){
        return new ResponseEntity(iPacienteService.eliminarPaciente(paciente), HttpStatus.ACCEPTED);
    }
    @PutMapping("change/data")
    public ResponseEntity actualizarDatos(@RequestBody Paciente paciente){
        return new ResponseEntity(iPacienteService.actualizarDatosPaciente(paciente), HttpStatus.ACCEPTED);
    }

}
