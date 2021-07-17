package com.teams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalTeamsRepository extends JpaRepository<NationalTeams, Long> {
}
