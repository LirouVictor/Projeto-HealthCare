package com.br.aulamanytomany.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.aulamanytomany.dto.PacienteDTO;
import com.br.aulamanytomany.entities.Paciente;
import com.br.aulamanytomany.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository repository;

    public List<PacienteDTO> listar() {
        List<Paciente> pacientes = repository.findAll();
        return pacientes.stream().map(x -> new PacienteDTO(x)).collect(Collectors.toList());
    }

    public String cadastro(Paciente paciente) {
        repository.save(paciente);
        return "Cadastrado com Sucesso!";
    }

    public String excluir(int id) {
        Paciente paciente = repository.findById(id).orElse(null);

        if (paciente != null) {
            repository.delete(paciente);
            return new String("Deletado com sucesso");
        }

        return new String("Registro não encontrado");
    }

    public String editar(Paciente newpaciente, int id) {
        Paciente paciente = repository.findById(id).orElse(null);

        paciente.setNome(newpaciente.getNome());
        paciente.setIdade(newpaciente.getIdade());
        paciente.setEndereco(newpaciente.getEndereco());

        repository.save(paciente);

        return new String("Paciente atualizado com sucesso!");
    }

}
