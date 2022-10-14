package com.example.jspring.repository;

import com.example.jspring.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    // <3
}