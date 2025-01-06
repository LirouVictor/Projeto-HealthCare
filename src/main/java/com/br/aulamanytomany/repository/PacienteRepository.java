package com.br.aulamanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.aulamanytomany.entities.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}
