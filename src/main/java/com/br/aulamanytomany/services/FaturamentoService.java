package com.br.aulamanytomany.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.aulamanytomany.dto.FaturamentoDTO;
import com.br.aulamanytomany.entities.Faturamento;
import com.br.aulamanytomany.entities.Material;
import com.br.aulamanytomany.entities.Medicamento;
import com.br.aulamanytomany.entities.Prescricao;
import com.br.aulamanytomany.entities.Procedimento;
import com.br.aulamanytomany.repository.FaturamentoRepository;

@Service
public class FaturamentoService {

    @Autowired
    FaturamentoRepository repository;

    public String cadastro(Faturamento faturamento) {
        repository.save(faturamento);
        return "Cadastrado com Sucesso!";
    }

    public List<FaturamentoDTO> listar() {
        List<Faturamento> faturamentos = repository.findAll();
        return faturamentos.stream()
                .map(faturamento -> {
                    double valorTotal = calcularValorTotal(faturamento.getPrescricao());
                    return new FaturamentoDTO(faturamento, valorTotal);
                })
                .collect(Collectors.toList());
    }

    // Método para calcular ou obter o valor total da prescrição
    private double calcularValorTotal(Prescricao prescricao) {
        double valorTotal = 0;

        valorTotal += prescricao.getMaterials().stream()
                .mapToDouble(Material::getValor)
                .sum() * prescricao.getQtdMaterial();

        valorTotal += prescricao.getMedicamentos().stream()
                .mapToDouble(Medicamento::getValor)
                .sum() * prescricao.getQtdMedicamento();

        valorTotal += prescricao.getProcedimentos().stream()
                .mapToDouble(Procedimento::getValor)
                .sum() * prescricao.getQtdProcedimento();

        return valorTotal;
    }

}