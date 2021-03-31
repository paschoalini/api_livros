package com.guilda_plataforma.api_livros.service;

import com.guilda_plataforma.api_livros.entities.Livro;
import com.guilda_plataforma.api_livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {
    @Autowired
    private LivroRepository repository;

    public List<Livro> listarTodosOsLivros() {
        return repository.findAll();
    }

    public List<Livro> listarLivroPorTema(String tema) {
        if(tema == null)
            listarTodosOsLivros();

        return repository.findAllByTemaIgnoreCase(tema);
    }
}
