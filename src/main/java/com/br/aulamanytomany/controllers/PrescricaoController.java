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

import com.br.aulamanytomany.dto.PrescricaoDTO;
import com.br.aulamanytomany.entities.Prescricao;
import com.br.aulamanytomany.services.PrescricaoService;

@RestController
@RequestMapping("/prescricao")
public class PrescricaoController {

    @Autowired
    PrescricaoService service;

    @GetMapping("/lista")
    public ResponseEntity<List<PrescricaoDTO>> listar() {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Prescricao prescricao) {
        return new ResponseEntity<>(service.cadastro(prescricao), HttpStatus.OK);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> excluir(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.excluir(id), HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editar(Prescricao newPrescricao, @PathVariable("id") int id) {
        return new ResponseEntity<>(service.editar(newPrescricao, id), HttpStatus.OK);
    }

}
