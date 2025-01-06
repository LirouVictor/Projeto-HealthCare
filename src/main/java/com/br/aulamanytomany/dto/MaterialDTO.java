package com.br.aulamanytomany.dto;

import com.br.aulamanytomany.entities.Material;

public class MaterialDTO {
    
    private String nome;
    private double valor;

    public MaterialDTO(Material material) {
        this.nome = material.getNome();
        this.valor = material.getValor();
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
