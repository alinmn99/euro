package com.teams.Controller;

import com.teams.Entities.Player;
import com.teams.Repository.PlayerRepository;
import com.teams.Repository.TeamBasementRepository;
import com.teams.Entities.TeamBasement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teamBasement")
public class TeamBasementController {

    @Autowired
    TeamBasementRepository teamBasementRepository;

    @GetMapping("/list")
    public String getBasement(Model model) {
        List<TeamBasement> teamBasementList = (List<TeamBasement>) teamBasementRepository.findAll();
        model.addAttribute("teamBasement", teamBasementList);
        return "teamBasement";
    }
}

