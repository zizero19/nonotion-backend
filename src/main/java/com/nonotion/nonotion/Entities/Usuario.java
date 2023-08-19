package com.nonotion.nonotion.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Boolean status;

    @OneToMany(mappedBy = "usuario")
    private List<DocTexto> docTexto;

    @OneToMany(mappedBy = "usuario")
    private List<ListaTarefas> listaTarefa;

    public Usuario(int id, String nome, String email, String senha, List<DocTexto> docTexto,
            List<ListaTarefas> listaTarefa, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.docTexto = docTexto;
        this.listaTarefa = listaTarefa;
        this.status = status;
    }

    public Usuario() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<DocTexto> getDocTexto() {
        return docTexto;
    }

    public void setDocTexto(List<DocTexto> docTexto) {
        this.docTexto = docTexto;
    }

    public List<ListaTarefas> getListaTarefa() {
        return listaTarefa;
    }

    public void setListaTarefa(List<ListaTarefas> listaTarefa) {
        this.listaTarefa = listaTarefa;
    }

}
