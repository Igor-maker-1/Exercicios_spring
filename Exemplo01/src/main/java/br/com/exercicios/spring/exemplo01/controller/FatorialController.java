package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.FatorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigInteger;

@RestController
@RequestMapping("/api/fatorial")
public class FatorialController {

    @Autowired


    FatorialService fatorialService;

    @GetMapping("/{numero}")
    public BigInteger fatorial(@PathVariable int numero) {
        try {
            return fatorialService.fatorial(numero);
        } catch (IllegalArgumentException exception) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }
    }
}
