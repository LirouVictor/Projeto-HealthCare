package com.br.aulamanytomany.dto;


import java.util.Set;

import com.br.aulamanytomany.entities.Material;
import com.br.aulamanytomany.entities.Medicamento;
import com.br.aulamanytomany.entities.Prescricao;
import com.br.aulamanytomany.entities.Procedimento;

public class PrescricaoDTO {
    
    private String paciente;
    private Set<Medicamento> medicamento;
    private int qtdMedicamento;
    private Set<Procedimento> procedimento;
    private int qtdProcedimento;
    private Set<Material> material;
    private int qtdMaterial;

    public PrescricaoDTO(Prescricao prescricao) {
        this.paciente = prescricao.getPaciente().getNome();
        this.medicamento = prescricao.getMedicamentos();
        this.qtdMedicamento = prescricao.getQtdMedicamento();
        this.procedimento = prescricao.getProcedimentos();
        this.qtdProcedimento = prescricao.getQtdProcedimento();
        this.material = prescricao.getMaterials();
        this.qtdMaterial = prescricao.getQtdMaterial();
    }
    
    public Set<Medicamento> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Set<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }

    public int getQtdMedicamento() {
        return qtdMedicamento;
    }

    public void setQtdMedicamento(int qtdMedicamento) {
        this.qtdMedicamento = qtdMedicamento;
    }

    public Set<Procedimento> getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Set<Procedimento> procedimento) {
        this.procedimento = procedimento;
    }

    public int getQtdProcedimento() {
        return qtdProcedimento;
    }

    public void setQtdProcedimento(int qtdProcedimento) {
        this.qtdProcedimento = qtdProcedimento;
    }

    public Set<Material> getMaterial() {
        return material;
    }

    public void setMaterial(Set<Material> material) {
        this.material = material;
    }

    public int getQtdMaterial() {
        return qtdMaterial;
    }

    public void setQtdMaterial(int qtdMaterial) {
        this.qtdMaterial = qtdMaterial;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
}
