package com.br.aulamanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.aulamanytomany.entities.Medicamento;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

}
