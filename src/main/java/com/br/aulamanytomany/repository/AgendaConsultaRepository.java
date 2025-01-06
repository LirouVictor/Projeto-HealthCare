package com.br.aulamanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.aulamanytomany.entities.AgendaConsulta;

@Repository
public interface AgendaConsultaRepository extends JpaRepository<AgendaConsulta, Integer> {

}
