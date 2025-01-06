package com.br.aulamanytomany.dto;

import com.br.aulamanytomany.entities.Prontuario;

public class ProntuarioDTO {
    
    private String pacienteNome;
    private String pacienteIdade;
    private String registroMedico;
    private String dataEntrada;
    private String dataAlta;
    private String convenio;

    public ProntuarioDTO(Prontuario prontuario) {
        this.pacienteNome = prontuario.getPaciente().getNome();
        this.pacienteIdade = prontuario.getPaciente().getIdade();
        this.registroMedico = prontuario.getRegistroMedico();
        this.dataEntrada = prontuario.getDataEntrada();
        this.dataAlta = prontuario.getDataAlta();
        this.convenio = prontuario.getConvenio();
    }

    public String getPacienteNome() {
        return pacienteNome;
    }

    public void setPacienteNome(String pacienteNome) {
        this.pacienteNome = pacienteNome;
    }

    public String getPacienteIdade() {
        return pacienteIdade;
    }

    public void setPacienteIdade(String pacienteIdade) {
        this.pacienteIdade = pacienteIdade;
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
