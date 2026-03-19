package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class PalindromoService {

    public boolean palindromo(String palavra) {
        if (palavra == null || palavra.isBlank()) {
            throw new IllegalArgumentException("Informe uma palavra valida.");
        }

        String normalizada = palavra.trim().toLowerCase(Locale.ROOT);
        String invertida = new StringBuilder(normalizada).reverse().toString();
        return normalizada.equals(invertida);
    }
}
