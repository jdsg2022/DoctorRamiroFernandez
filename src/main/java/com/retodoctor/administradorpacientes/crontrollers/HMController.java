package com.retodoctor.administradorpacientes.crontrollers;

import com.retodoctor.administradorpacientes.models.HistoriaMedica;
import com.retodoctor.administradorpacientes.models.Paciente;
import com.retodoctor.administradorpacientes.service.IHistoriaMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest")
public class HMController {
    @Autowired
    private IHistoriaMService iHistoriaMService;

    @GetMapping("bring/HM")
    public ResponseEntity historiasMedicasRegistradas(){
        return new ResponseEntity(iHistoriaMService.historiasMedicasRegistradas(), HttpStatus.FOUND);
    }
    @PostMapping("add/HM")
    public ResponseEntity agregarHM(@RequestBody HistoriaMedica historiaMedica){
        return new ResponseEntity(iHistoriaMService.agregarHistoriaMedica(historiaMedica), HttpStatus.CREATED);
    }
    @PutMapping("change/dataHM")
    public ResponseEntity actualizarDatosHM(@RequestBody HistoriaMedica historiaMedica){
        return new ResponseEntity(iHistoriaMService, HttpStatus.ACCEPTED);
    }
}
