package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class Atividade2RomanoService {

    public int romanoParaDecimal(String numeroRomano) {
        if (numeroRomano == null || numeroRomano.isBlank()) {
            throw new IllegalArgumentException("Informe um numero romano valido.");
        }

        String romano = numeroRomano.trim().toUpperCase(Locale.ROOT);
        if (!romano.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
            throw new IllegalArgumentException("Numero romano invalido.");
        }

        int total = 0;
        for (int i = 0; i < romano.length(); i++) {
            int atual = valorRomano(romano.charAt(i));
            int proximo = (i + 1 < romano.length()) ? valorRomano(romano.charAt(i + 1)) : 0;
            total += (atual < proximo) ? -atual : atual;
        }

        return total;
    }

    private int valorRomano(char caractere) {
        return switch (caractere) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Numero romano invalido.");
        };
    }
}
