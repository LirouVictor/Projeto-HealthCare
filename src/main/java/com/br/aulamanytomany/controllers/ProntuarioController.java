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

import com.br.aulamanytomany.dto.ProntuarioDTO;
import com.br.aulamanytomany.entities.Prontuario;
import com.br.aulamanytomany.services.ProntuarioService;

@RestController
@RequestMapping("/prontuario")
public class ProntuarioController {

    @Autowired
    ProntuarioService service;

    @GetMapping("/lista")
    public ResponseEntity<List<ProntuarioDTO>> listar() {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Prontuario prontuario) {
        return new ResponseEntity<>(service.cadastro(prontuario), HttpStatus.OK);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> excluir(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.excluir(id), HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editar(Prontuario newProntuario, @PathVariable("id") int id) {
        return new ResponseEntity<>(service.editar(newProntuario, id), HttpStatus.OK);
    }

}
