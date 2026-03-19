package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class FatorialService {

    public BigInteger fatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Informe um numero inteiro nao negativo.");
        }

        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= numero; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }
}
