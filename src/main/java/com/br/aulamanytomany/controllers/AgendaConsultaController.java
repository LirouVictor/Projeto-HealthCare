package com.br.aulamanytomany.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.aulamanytomany.dto.AgendaConsultaDTO;
import com.br.aulamanytomany.entities.AgendaConsulta;
import com.br.aulamanytomany.services.AgendaConsultaService;

@RestController
@RequestMapping("/agendaConsulta")
public class AgendaConsultaController {

    @Autowired
    AgendaConsultaService service;

    @GetMapping("/lista")
    public ResponseEntity<List<AgendaConsultaDTO>> listar() {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(AgendaConsulta agendaConsulta) {
        return new ResponseEntity<>(service.cadastro(agendaConsulta), HttpStatus.OK);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> excluir(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.excluir(id), HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editar(AgendaConsulta newAgendaConsulta, @PathVariable("id") int id) {
        return new ResponseEntity<>(service.editar(newAgendaConsulta, id), HttpStatus.OK);
    }

}
