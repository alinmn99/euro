package com.teams.Repository;

import com.teams.Entities.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository <Player, Long> {
}
