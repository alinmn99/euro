package com.teams.Repository;

import com.teams.Entities.NationalTeams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalTeamsRepository extends JpaRepository<NationalTeams, Long> {
}
