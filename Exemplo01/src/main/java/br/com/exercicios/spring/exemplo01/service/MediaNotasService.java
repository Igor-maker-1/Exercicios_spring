package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaNotasService {

    public double mediaNotas(List<Double> notas) {
        if (notas == null || notas.isEmpty()) {
            throw new IllegalArgumentException("Informe ao menos uma nota.");
        }

        double soma = 0.0;
        for (Double nota : notas) {
            if (nota == null) {
                throw new IllegalArgumentException("As notas devem ser valores numericos.");
            }
            soma += nota;
        }

        return soma / notas.size();
    }
}
