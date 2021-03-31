package com.guilda_plataforma.api_livros.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void quando_chama_rota_index_retorna_http_status_200() throws Exception {
        ResultActions perform = mvc.perform(
                MockMvcRequestBuilders
                        .get("/")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void quando_chama_rota_index_retorna_mensagem() throws Exception {
        ResultActions perform = mvc.perform(
                MockMvcRequestBuilders
                        .get("/")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string(equalTo("API Livros - Guilda Plataforma")));
    }

    @Test
    public void quando_chama_rota_listar_retorna_http_status_200() throws Exception {
        ResultActions perform = mvc.perform(
                MockMvcRequestBuilders
                        .get("/listar")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void quando_chama_rota_listar_retorna_mensagem() throws Exception {
        ResultActions perform = mvc.perform(
                MockMvcRequestBuilders
                        .get("/listar")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string(equalTo("API Livros - Listando todos os livros")));
    }

    @Test
    public void quando_chama_rota_listar_tema_retorna_http_status_200() throws Exception {
        ResultActions perform = mvc.perform(
                MockMvcRequestBuilders
                        .get("/listar/tema/teste")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void quando_chama_rota_listar_tema_retorna_mensagem() throws Exception {
        ResultActions perform = mvc.perform(
                MockMvcRequestBuilders
                        .get("/listar/tema/teste")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string(equalTo("API Livros - Listando livros por tema: teste")));
    }

    @Test
    public void quando_chama_rota_listar_emprestado_retorna_http_status_200() throws Exception {
        ResultActions perform = mvc.perform(
                MockMvcRequestBuilders
                        .get("/listar/emprestado")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void quando_chama_rota_listar_emprestado_retorna_mensagem() throws Exception {
        ResultActions perform = mvc.perform(
                MockMvcRequestBuilders
                        .get("/listar/emprestado")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string(equalTo("API Livros - Listando livros emprestados")));
    }

    @Test
    public void quando_chama_rota_listar_nao_emprestado_retorna_http_status_200() throws Exception {
        ResultActions perform = mvc.perform(
                MockMvcRequestBuilders
                        .get("/listar/nao-emprestado")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void quando_chama_rota_listar_nao_emprestado_retorna_mensagem() throws Exception {
        ResultActions perform = mvc.perform(
                MockMvcRequestBuilders
                        .get("/listar/nao-emprestado")
                        .accept(MediaType.APPLICATION_JSON)
                        .characterEncoding("UTF-8"))
                .andExpect(content().string(equalTo("API Livros - Listando livros da estante")));
    }

}
