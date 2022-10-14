package com.example.jspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aluno_intel")
public class Aluno {
    @Id
    @Column
    private int ra;

    @Column
    private String nome;


}
