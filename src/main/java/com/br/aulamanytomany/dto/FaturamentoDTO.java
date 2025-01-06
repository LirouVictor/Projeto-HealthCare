package com.br.aulamanytomany.dto;

import com.br.aulamanytomany.entities.Faturamento;

public class FaturamentoDTO {
    
    private String pacienteNome;
    private double valorTotal;

    public FaturamentoDTO(Faturamento faturamento, double valorTotal) {
        this.pacienteNome = faturamento.getPaciente().getNome();
        this.valorTotal = valorTotal;
    }

    public String getPacienteNome() {
        return pacienteNome;
    }

    public void setPacienteNome(String pacienteNome) {
        this.pacienteNome = pacienteNome;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    

    
}
