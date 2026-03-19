package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.TrianguloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/triangulo")
public class TrianguloController {

    @Autowired
    TrianguloService trianguloService;

    @GetMapping("/area")
    public double areaTriangulo(@RequestParam double base, @RequestParam double altura) {
        try {
            return trianguloService.areaTriangulo(base, altura);
        } catch (IllegalArgumentException exception) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }
    }
}
