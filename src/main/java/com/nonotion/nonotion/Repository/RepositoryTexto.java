package com.nonotion.nonotion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nonotion.nonotion.Entities.DocTexto;

@Repository
public interface RepositoryTexto extends JpaRepository<DocTexto, Integer> {

}