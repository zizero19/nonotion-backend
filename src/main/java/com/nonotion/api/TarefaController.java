package com.nonotion.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nonotion.nonotion.Repository.RepositoryTarefas;

@RestController
@RequestMapping(value = "/tarefa")
public class TarefaController {

    @Autowired
    RepositoryTarefas tRepository;

}