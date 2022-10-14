package com.example.jspring.control;

import com.example.jspring.model.Aluno;
import com.example.jspring.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController implements IControl<Aluno, Integer> {
    @Autowired
    private AlunoRepository repo;

    @GetMapping(value = "/alunos")
    public List<Aluno> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/alunos/{ra}")
    public Optional<Aluno> findByID(@PathVariable(value = "ra") Integer ra) {
        return repo.findById(ra);
    }

    @GetMapping(value = "/hi")
    public String hello() {
        return "<b>HTML</b> (abreviação para a expressão inglesa <i>HyperText Markup Language</i>, que significa Linguagem de Marcação de Hipertexto) é uma linguagem de marcação utilizada na construção de páginas na <i>Web</i>. Documentos <b>HTML</b> podem ser interpretados por navegadores. A tecnologia é fruto da junção entre os padrões <i><b>HyTime<sup>1</sup></b></i> e <b>SGML<sup>2</sup></b>.";
    }
}
