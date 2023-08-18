package com.nonotion.nonotion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nonotion.nonotion.Entities.Usuario;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, Integer> {

}