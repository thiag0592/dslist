 package com.investme.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.investme.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
