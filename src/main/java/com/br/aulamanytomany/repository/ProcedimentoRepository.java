package com.br.aulamanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.aulamanytomany.entities.Procedimento;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Integer> {

}
