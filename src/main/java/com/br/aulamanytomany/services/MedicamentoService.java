package com.br.aulamanytomany.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.aulamanytomany.dto.MedicamentoDTO;
import com.br.aulamanytomany.entities.Medicamento;
import com.br.aulamanytomany.repository.MedicamentoRepository;

@Service
public class MedicamentoService {

    @Autowired
    MedicamentoRepository repository;

    public List<MedicamentoDTO> listar() {
        List<Medicamento> medicamentos = repository.findAll();
        return medicamentos.stream().map(x -> new MedicamentoDTO(x)).collect(Collectors.toList());
    }

    public String cadastro(Medicamento medicamento) {
        repository.save(medicamento);
        return "Cadastrado com Sucesso!";
    }

}
