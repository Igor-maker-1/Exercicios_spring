package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.TemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/temperatura")
public class TemperaturaController {

    @Autowired
    TemperaturaService temperaturaService;

    @GetMapping("/celsius-para-fahrenheit")
    public double celsiusParaFahrenheit(@RequestParam double celsius) {
        return temperaturaService.celsiusParaFahrenheit(celsius);
    }
}
