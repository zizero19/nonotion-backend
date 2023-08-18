package com.nonotion.nonotion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nonotion.nonotion.Entities.ListaTarefas;

@Repository
public interface RepositoryTarefas extends JpaRepository<ListaTarefas, Integer> {

}