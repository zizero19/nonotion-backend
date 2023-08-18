package com.nonotion.nonotion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nonotion.nonotion.Entities.Categoria;

@Repository
public interface RepositoryCategoria extends JpaRepository<Categoria, Integer> {

}