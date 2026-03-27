package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Emprestimo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/EmprestimoController")
public class EmprestimoController {
    @PostMapping("Emprestimo")
    public Emprestimo cadastrarEmprestimo(@RequestBody Emprestimo emprestimo){return emprestimo;}
}
