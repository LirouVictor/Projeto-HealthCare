package com.br.aulamanytomany.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.aulamanytomany.dto.ProntuarioDTO;
import com.br.aulamanytomany.entities.Prontuario;
import com.br.aulamanytomany.repository.ProntuarioRepository;

@Service
public class ProntuarioService {

    @Autowired
    ProntuarioRepository repository;

    public List<ProntuarioDTO> listar() {
        List<Prontuario> prontuarios = repository.findAll();
        return prontuarios.stream().map(x -> new ProntuarioDTO(x)).collect(Collectors.toList());
    }

    public String cadastro(Prontuario prontuario) {
        repository.save(prontuario);
        return "Cadastrado com Sucesso!";
    }

    public String excluir(int id) {
        Prontuario prontuario = repository.findById(id).orElse(null);

        if (prontuario != null) {
            repository.delete(prontuario);
            return new String("Deletado com sucesso");
        }

        return new String("Registro não encontrado");
    }

    public String editar(Prontuario newprontuario, int id) {
        Prontuario prontuario = repository.findById(id).orElse(null);

        prontuario.setRegistroMedico(newprontuario.getRegistroMedico());
        prontuario.setDataEntrada(newprontuario.getDataEntrada());
        prontuario.setDataAlta(newprontuario.getDataAlta());
        prontuario.setConvenio(newprontuario.getConvenio());

        repository.save(prontuario);

        return new String("Prontuario atualizado com sucesso!");
    }

}
