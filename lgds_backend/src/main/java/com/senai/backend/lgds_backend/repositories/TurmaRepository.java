package com.senai.backend.lgds_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.lgds_backend.models.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {

}
