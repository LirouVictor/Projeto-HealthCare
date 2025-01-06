package com.br.aulamanytomany.entities;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Prescricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente paciente;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "prescricao_medicamento", joinColumns = @JoinColumn(name = "prescricao_id"), inverseJoinColumns = @JoinColumn(name = "medicamento_id"))
    private Set<Medicamento> medicamentos;

    private int qtdMedicamento;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "prescricao_procedimento", joinColumns = @JoinColumn(name = "prescricao_id"), inverseJoinColumns = @JoinColumn(name = "procedimento_id"))
    private Set<Procedimento> procedimentos;

    private int qtdProcedimento;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "prescricao_material", joinColumns = @JoinColumn(name = "prescricao_id"), inverseJoinColumns = @JoinColumn(name = "material_id"))
    private Set<Material> materials;

    private int qtdMaterial;

    @OneToMany(mappedBy = "prescricao")
    private List<Faturamento> faturamentos;

    public Prescricao() {
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

    public Set<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Set<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public int getQtdMedicamento() {
        return qtdMedicamento;
    }

    public void setQtdMedicamento(int qtdMedicamento) {
        this.qtdMedicamento = qtdMedicamento;
    }

    public Set<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(Set<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public int getQtdProcedimento() {
        return qtdProcedimento;
    }

    public void setQtdProcedimento(int qtdProcedimento) {
        this.qtdProcedimento = qtdProcedimento;
    }

    public Set<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<Material> materials) {
        this.materials = materials;
    }

    public int getQtdMaterial() {
        return qtdMaterial;
    }

    public void setQtdMaterial(int qtdMaterial) {
        this.qtdMaterial = qtdMaterial;
    }

    public List<Faturamento> getFaturamentos() {
        return faturamentos;
    }

    public void setFaturamentos(List<Faturamento> faturamentos) {
        this.faturamentos = faturamentos;
    }
    

    
}
