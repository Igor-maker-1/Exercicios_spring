package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exemplo01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exemplo01")

public class Exemplo01 {
@Autowired
    Exemplo01Service exemplo01Service;
    @GetMapping
    public String getExemplo01(){
        return "Get: Exemplo01";

    }

    @GetMapping("soma/{a}/{b}")
    public String soma(@PathVariable int a, @PathVariable int b){
        return "A soma dos valores informados é : "
                + exemplo01Service.soma(a, b);
    }
}
