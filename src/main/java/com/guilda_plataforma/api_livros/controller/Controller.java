package com.guilda_plataforma.api_livros.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("API Livros - Guilda Plataforma");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/listar")
    public ResponseEntity<String> listarTodosOsLivros() {
        return ResponseEntity.ok("API Livros - Listando todos os livros");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/listar/tema/{tema}")
    public ResponseEntity<String> listarLivroPorTema(@PathVariable("tema") String tema) {
        return ResponseEntity.ok("API Livros - Listando livros por tema: " + tema);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/listar/emprestado")
    public ResponseEntity<String> listarLivrosEmprestados() {
        return ResponseEntity.ok("API Livros - Listando livros emprestados");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/listar/nao-emprestado")
    public ResponseEntity<String> listarLivrosNaoEmprestados() {
        return ResponseEntity.ok("API Livros - Listando livros da estante");
    }
}
