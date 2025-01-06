package com.br.aulamanytomany.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Material {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private double valor;

    @JsonIgnore
    @ManyToMany(mappedBy = "materials", fetch = FetchType.EAGER)
    List<Prescricao> prescricaos;

    public Material() {
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Prescricao> getPrescricaos() {
        return prescricaos;
    }

    public void setPrescricaos(List<Prescricao> prescricaos) {
        this.prescricaos = prescricaos;
    }
}
