package com.br.aulamanytomany.dto;

import com.br.aulamanytomany.entities.AgendaConsulta;

public class AgendaConsultaDTO {
    
    private String paciente;
    private String data;
    private String hora;

    public AgendaConsultaDTO(AgendaConsulta agendaConsulta) {
        this.paciente = agendaConsulta.getPaciente().getNome();
        this.data = agendaConsulta.getData();
        this.hora = agendaConsulta.getHora();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    
}
