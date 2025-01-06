package com.br.aulamanytomany.dto;

import com.br.aulamanytomany.entities.Paciente;

public class PacienteDTO {
    
    private String nome;
    private String idade;

    public PacienteDTO(Paciente paciente) {
        this.nome = paciente.getNome();
        this.idade = paciente.getIdade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

}
