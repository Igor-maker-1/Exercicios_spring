package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class HorasService {

    public double horasParaMinutos(double horas) {
        if (horas < 0) {
            throw new IllegalArgumentException("Informe um valor de horas maior ou igual a zero.");
        }

        return horas * 60.0;
    }
}
