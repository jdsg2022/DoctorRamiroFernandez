package com.retodoctor.administradorpacientes.crontrollers;

import com.retodoctor.administradorpacientes.models.CitaMedica;
import com.retodoctor.administradorpacientes.models.HistoriaMedica;
import com.retodoctor.administradorpacientes.service.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest")
public class CitaController {
    @Autowired
    private ICitaService iCitaService;
    @GetMapping("bring/cita")
    public ResponseEntity citasAgendadas(){
        return new ResponseEntity(iCitaService.listaCitas(), HttpStatus.FOUND);
    }
    @PostMapping("add/cita")
    public ResponseEntity agendarCita(@RequestBody CitaMedica citaMedica){
        return new ResponseEntity(iCitaService.agendarCita(citaMedica), HttpStatus.CREATED);
    }
}
