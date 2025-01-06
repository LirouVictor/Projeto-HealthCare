package com.br.aulamanytomany.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String idade;
    private String endereco;

    @OneToMany(mappedBy = "paciente")
    private List<AgendaConsulta> agendaConsultas;

    @OneToMany(mappedBy = "paciente")
    private List<Faturamento> faturamentos;

    public Paciente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<AgendaConsulta> getAgendaConsultas() {
        return agendaConsultas;
    }

    public void setAgendaConsultas(List<AgendaConsulta> agendaConsultas) {
        this.agendaConsultas = agendaConsultas;
    }

    public List<Faturamento> getFaturamentos() {
        return faturamentos;
    }

    public void setFaturamentos(List<Faturamento> faturamentos) {
        this.faturamentos = faturamentos;
    }
}
