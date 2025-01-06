package com.br.aulamanytomany.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.aulamanytomany.dto.MaterialDTO;
import com.br.aulamanytomany.entities.Material;
import com.br.aulamanytomany.repository.MaterialRepository;

@Service
public class MaterialService {

    @Autowired
    MaterialRepository repository;

    public List<MaterialDTO> listar() {
        List<Material> materials = repository.findAll();
        return materials.stream().map(x -> new MaterialDTO(x)).collect(Collectors.toList());
    }

    public String cadastro(Material material) {
        repository.save(material);
        return "Cadastrado com Sucesso!";
    }

}
