package com.guilda_plataforma.api_livros.controller;

import com.guilda_plataforma.api_livros.entities.Livro;
import com.guilda_plataforma.api_livros.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private ApiService service;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("API Livros - Guilda Plataforma");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/listar")
    public ResponseEntity<List<Livro>> listarTodosOsLivros() {
        return ResponseEntity.ok(service.listarTodosOsLivros());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/listar/tema/{tema}")
    public ResponseEntity<List<Livro>> listarLivroPorTema(@PathVariable("tema") String tema) {
        return ResponseEntity.ok(service.listarLivroPorTema(tema));
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
