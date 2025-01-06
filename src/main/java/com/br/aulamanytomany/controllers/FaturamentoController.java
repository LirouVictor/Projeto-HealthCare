package com.br.aulamanytomany.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.aulamanytomany.dto.FaturamentoDTO;
import com.br.aulamanytomany.entities.Faturamento;
import com.br.aulamanytomany.services.FaturamentoService;

@RestController
@RequestMapping("/faturamento")
public class FaturamentoController {

    @Autowired
    FaturamentoService service;

    @GetMapping("/lista")
    public ResponseEntity<List<FaturamentoDTO>> listar() {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Faturamento faturamento) {
        return new ResponseEntity<>(service.cadastro(faturamento), HttpStatus.OK);
    }

}
