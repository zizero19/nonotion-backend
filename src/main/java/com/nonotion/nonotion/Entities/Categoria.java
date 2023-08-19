package com.nonotion.nonotion.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;

    @OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)
    private List<DocTexto> docTexto;

    public Categoria(int id, String descricao, List<DocTexto> docTexto) {
        this.id = id;
        this.descricao = descricao;
        this.docTexto = docTexto;
    }

    public Categoria() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<DocTexto> getDocTexto() {
        return docTexto;
    }

    public void setDocTexto(List<DocTexto> docTexto) {
        this.docTexto = docTexto;
    }

}
