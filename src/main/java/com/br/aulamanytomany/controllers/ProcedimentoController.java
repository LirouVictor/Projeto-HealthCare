package com.br.aulamanytomany.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.aulamanytomany.dto.ProcedimentoDTO;
import com.br.aulamanytomany.entities.Procedimento;
import com.br.aulamanytomany.services.ProcedimentoService;

@RestController
@RequestMapping("/procedimento")
public class ProcedimentoController {

    @Autowired
    ProcedimentoService service;

    @GetMapping("/lista")
    public ResponseEntity<List<ProcedimentoDTO>> listar() {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Procedimento procedimento) {
        return new ResponseEntity<>(service.cadastro(procedimento), HttpStatus.OK);
    }

}
