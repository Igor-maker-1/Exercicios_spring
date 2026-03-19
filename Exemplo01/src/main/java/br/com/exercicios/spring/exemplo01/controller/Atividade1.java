package br.com.exercicios.spring.exemplo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController("atividade1Controller")
@RequestMapping("/api/atividade1")
public class Atividade1 {

    @Autowired

            
    br.com.exercicios.spring.exemplo01.service.Atividade1 atividade1Service;

    @GetMapping("/binario-para-decimal/{binario}")
    public int binarioParaDecimal(@PathVariable String binario) {
        try {
            return atividade1Service.binarioParaDecimal(binario);
        } catch (IllegalArgumentException exception) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }
    }
}
