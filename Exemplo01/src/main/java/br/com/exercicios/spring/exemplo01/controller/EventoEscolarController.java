package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.EventoEscolar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/EventoEscolarController")
public class EventoEscolarController {
    @PostMapping ("EventoEscolar")
    public  EventoEscolar cadastrarEventoEscolar (@RequestBody EventoEscolar eventoEscolar){return eventoEscolar;}


}
