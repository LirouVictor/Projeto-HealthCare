package com.br.aulamanytomany.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.aulamanytomany.dto.ProcedimentoDTO;
import com.br.aulamanytomany.entities.Procedimento;
import com.br.aulamanytomany.repository.ProcedimentoRepository;

@Service
public class ProcedimentoService {

    @Autowired
    ProcedimentoRepository repository;

    public List<ProcedimentoDTO> listar() {
        List<Procedimento> procedimentos = repository.findAll();
        return procedimentos.stream().map(x -> new ProcedimentoDTO(x)).collect(Collectors.toList());
    }

    public String cadastro(Procedimento procedimento) {
        repository.save(procedimento);
        return "Cadastrado com Sucesso!";
    }

}
