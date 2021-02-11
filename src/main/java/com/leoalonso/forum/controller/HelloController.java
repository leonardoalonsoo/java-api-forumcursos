package com.leoalonso.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "API Rest Forum - Realizada com os aprendizados dos cursos de Java da Alura - Para ver o funcionamento acesse o /topicos";
    }



}
