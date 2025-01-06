package com.br.aulamanytomany.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.aulamanytomany.dto.PrescricaoDTO;
import com.br.aulamanytomany.entities.Prescricao;
import com.br.aulamanytomany.repository.PrescricaoRepository;

@Service
public class PrescricaoService {

    @Autowired
    PrescricaoRepository repository;

    public List<PrescricaoDTO> listar() {
        List<Prescricao> prescricaos = repository.findAll();
        return prescricaos.stream().map(x -> new PrescricaoDTO(x)).collect(Collectors.toList());
    }

    public String cadastro(Prescricao prescricao) {
        repository.save(prescricao);
        return "Cadastrado com Sucesso!";
    }

    public String excluir(int id) {
        Prescricao prescricao = repository.findById(id).orElse(null);

        if (prescricao != null) {
            repository.delete(prescricao);
            return new String("Deletado com sucesso");
        }

        return new String("Registro não encontrado");
    }

    public String editar(Prescricao newprescricao, int id) {
        Prescricao prescricao = repository.findById(id).orElse(null);

        prescricao.setMaterials(newprescricao.getMaterials());
        prescricao.setQtdMaterial(newprescricao.getQtdMaterial());
        prescricao.setMedicamentos(newprescricao.getMedicamentos());
        prescricao.setQtdMedicamento(newprescricao.getQtdMedicamento());
        prescricao.setProcedimentos(newprescricao.getProcedimentos());
        prescricao.setQtdProcedimento(newprescricao.getQtdProcedimento());

        repository.save(prescricao);

        return new String("Prescricao atualizado com sucesso!");
    }

}
