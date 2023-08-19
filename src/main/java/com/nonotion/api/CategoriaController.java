package com.nonotion.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nonotion.nonotion.Entities.Categoria;
import com.nonotion.nonotion.Repository.RepositoryCategoria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @Autowired
    RepositoryCategoria cRepository;

    @GetMapping("/listaTarefa")
    public String getObject() {
        /*
         * ModelAndView mv = new ModelAndView("listaTarefa");
         * List<Categoria> categorias = new ArrayList<>();
         * categorias = (List<Categoria>) cRepository.findAll();
         * mv.addObject("categorias", categorias);
         */
        return "/listaTarefa";
    }

    @PostMapping("/cadastro")
    public Categoria cadastro(Categoria categoria) {
        cRepository.save(categoria);
        return categoria;
    }

}