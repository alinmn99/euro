package com.teams.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamBasementRepository extends CrudRepository<TeamBasement, Long> {
}
