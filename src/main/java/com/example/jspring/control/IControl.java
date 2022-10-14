package com.example.jspring.control;

import com.example.jspring.model.Aluno;

import java.util.List;
import java.util.Optional;

public interface IControl<T, ID> {
    List<T> findAll();

    Optional<Aluno> findByID(ID id);
}
