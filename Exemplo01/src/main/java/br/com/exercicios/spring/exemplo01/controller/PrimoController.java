package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.PrimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/primo")
public class PrimoController {

    @Autowired
    PrimoService primoService;

    @GetMapping("/{numero}")
    public boolean numeroPrimo(@PathVariable int numero) {
        return primoService.numeroPrimo(numero);
    }
}
