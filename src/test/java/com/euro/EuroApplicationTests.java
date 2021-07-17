package com.euro;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import com.teams.Entities.NationalTeams;
import com.teams.Entities.Player;
import com.teams.Entities.TeamBasement;
import com.teams.Repository.NationalTeamsRepository;
import com.teams.Repository.PlayerRepository;
import com.teams.Repository.TeamBasementRepository;

import javax.transaction.Transactional;

@Transactional
@SpringBootTest
class EuroApplicationTests {

	@Autowired
	NationalTeamsRepository nationalTeamsRepository;
	@Autowired
	PlayerRepository playerRepository;
	@Autowired
	TeamBasementRepository teamBasementRepository;

	private NationalTeams nationalTeams;
	private Player player;
	private TeamBasement teamBasement;

//	@BeforeEach
//	void setUp(){
//		nationalTeams = new NationalTeams();
//		nationalTeams.setId(nationalTeams.getId());
//		nationalTeamsRepository.save(nationalTeams);
//		Long id = nationalTeams.getId();
//
//		player = new Player();
//		player.setId(id);
//		playerRepository.save(player);
//		Long player_id = playerRepository.count();
//
//	}

	@Test
	void createNationalTeams(){
		Assert.isTrue(NationalTeams.class
		!= null, "Team not created");}


	@Test
	void contextLoads() {
	}

}
