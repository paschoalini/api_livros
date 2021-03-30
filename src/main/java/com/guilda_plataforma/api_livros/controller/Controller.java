package com.guilda_plataforma.api_livros.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public String index() {
        return "API Livros - Guilda Plataforma";
    }
}
