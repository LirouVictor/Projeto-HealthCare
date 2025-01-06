package com.br.aulamanytomany.dto;

import com.br.aulamanytomany.entities.Medicamento;

public class MedicamentoDTO {
    
    private String nome;
    private double valor;

    public MedicamentoDTO(Medicamento medicamento) {
        this.nome = medicamento.getNome();
        this.valor = medicamento.getValor();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
