package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Atividade2RomanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/atividade2")
public class Atividade2RomanoController {

    @Autowired
    Atividade2RomanoService atividade2RomanoService;

    @GetMapping("/para-decimal")
    public int romanoParaDecimal(@RequestParam String numeroRomano) {
        try {
            return atividade2RomanoService.romanoParaDecimal(numeroRomano);
        } catch (IllegalArgumentException exception) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }
    }
}
