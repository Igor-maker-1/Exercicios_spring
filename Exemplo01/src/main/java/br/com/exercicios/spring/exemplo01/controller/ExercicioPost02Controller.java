package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Aluno;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ExercicioPost02Controller")
public class ExercicioPost02Controller {
 @PostMapping("aluno")
    public Aluno cadastrarAluno (@RequestBody Aluno aluno){return aluno; }
}
