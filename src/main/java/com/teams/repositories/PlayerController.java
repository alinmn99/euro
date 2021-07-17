package com.teams.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PlayerController {

    @Autowired
   PlayerRepository playerRepository;

    @GetMapping("/player")
    public String getPlayers (Model model) {
        List<Player> players = (List<Player>) playerRepository.findAll();
        model.addAttribute("players", players);
        return "players";

    }
}



