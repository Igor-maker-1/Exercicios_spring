package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class TemperaturaService {

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}
