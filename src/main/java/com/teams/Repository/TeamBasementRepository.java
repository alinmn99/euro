package com.teams.Repository;

import com.teams.Entities.TeamBasement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamBasementRepository extends CrudRepository<TeamBasement, Long> {
}
