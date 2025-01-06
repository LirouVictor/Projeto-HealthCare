package com.br.aulamanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.aulamanytomany.entities.Prontuario;

@Repository
public interface ProntuarioRepository extends JpaRepository<Prontuario, Integer> {

}
