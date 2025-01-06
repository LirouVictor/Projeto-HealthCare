package com.br.aulamanytomany.dto;

import com.br.aulamanytomany.entities.Procedimento;

public class ProcedimentoDTO {
    
    private String nome;
    private double valor;

    public ProcedimentoDTO(Procedimento procedimento) {
        this.valor = procedimento.getValor();
        this.nome = procedimento.getNome();
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
