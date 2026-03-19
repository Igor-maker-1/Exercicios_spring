package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.HorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/horas")
public class HorasController {

    @Autowired
    HorasService horasService;

    @GetMapping("/para-minutos")
    public double horasParaMinutos(@RequestParam double horas) {
        try {
            return horasService.horasParaMinutos(horas);
        } catch (IllegalArgumentException exception) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }
    }
}
