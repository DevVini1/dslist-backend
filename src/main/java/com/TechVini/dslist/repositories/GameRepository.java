package com.TechVini.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TechVini.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
