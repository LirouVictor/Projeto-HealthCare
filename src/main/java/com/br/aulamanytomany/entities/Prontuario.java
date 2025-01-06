package com.br.aulamanytomany.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Prontuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente paciente;

    private String registroMedico;
    private String dataEntrada;
    private String dataAlta;
    private String convenio;

    public Prontuario() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getRegistroMedico() {
        return registroMedico;
    }
    public void setRegistroMedico(String registroMedico) {
        this.registroMedico = registroMedico;
    }
    public String getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public String getDataAlta() {
        return dataAlta;
    }
    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }
    public String getConvenio() {
        return convenio;
    }
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    




}
