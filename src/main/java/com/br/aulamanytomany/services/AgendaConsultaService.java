package com.br.aulamanytomany.services;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.aulamanytomany.dto.AgendaConsultaDTO;
import com.br.aulamanytomany.entities.AgendaConsulta;
import com.br.aulamanytomany.repository.AgendaConsultaRepository;

@Service
public class AgendaConsultaService {

    @Autowired
    AgendaConsultaRepository repository;

    public List<AgendaConsultaDTO> listar() {
        List<AgendaConsulta> agendaConsultas = repository.findAll();
        return agendaConsultas.stream().map(x -> new AgendaConsultaDTO(x)).collect(Collectors.toList());
    }

    public String cadastro(AgendaConsulta agendaConsulta) {
        Random random = new Random();
        int disponibilidade = random.nextInt(4) + 1;
        if (disponibilidade == 1 || disponibilidade == 3) {
            return "Agenda sem disponibilidade!";
        }
        repository.save(agendaConsulta);
        return "Agenda disponível, cadastrado com Sucesso!";
    }

    public String excluir(int id) {
        AgendaConsulta agendaConsulta = repository.findById(id).orElse(null);

        if (agendaConsulta != null) {
            repository.delete(agendaConsulta);
            return new String("Deletado com sucesso");
        }

        return new String("Registro não encontrado");
    }

    public String editar(AgendaConsulta newagendaConsulta, int id) {
        AgendaConsulta agendaConsulta = repository.findById(id).orElse(null);

        agendaConsulta.setData(newagendaConsulta.getData());
        agendaConsulta.setHora(newagendaConsulta.getHora());

        repository.save(agendaConsulta);

        return new String("Agenda atualizada com sucesso!");
    }

}
