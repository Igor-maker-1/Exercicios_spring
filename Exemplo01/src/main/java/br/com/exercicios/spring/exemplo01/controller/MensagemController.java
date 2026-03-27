package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Mensagem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api/MensagemController")
public class MensagemController {
    @PostMapping ("Mensagem")
    public Mensagem cadastrarMensagem (@RequestBody Mensagem mensagem){return mensagem;}

}
