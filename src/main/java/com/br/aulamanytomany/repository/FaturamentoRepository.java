package com.br.aulamanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.aulamanytomany.entities.Faturamento;

@Repository
public interface FaturamentoRepository extends JpaRepository<Faturamento, Integer> {

}
