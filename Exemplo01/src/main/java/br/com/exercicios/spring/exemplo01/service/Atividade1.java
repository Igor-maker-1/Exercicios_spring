package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

@Service("atividade1Service")
public class Atividade1 {

    public int binarioParaDecimal(String binario) {
        if (binario == null || !binario.matches("[01]+")) {
            throw new IllegalArgumentException("Informe apenas digitos binarios (0 e 1).");
        }

        return Integer.parseInt(binario, 2);
    }
}
