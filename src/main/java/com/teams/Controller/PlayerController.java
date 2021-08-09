package com.teams.Controller;

import com.teams.Entities.NationalTeams;
import com.teams.Entities.Player;
import com.teams.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/list")
    public String getPlayers(Model model) {
        List<Player> players = (List<Player>) playerRepository.findAll();
        model.addAttribute("players", players);
        return "players";

    }

    @GetMapping("/add")
    public String addPlayer(Model model) {
        Player player = new Player();
        model.addAttribute("player", player);
        return "player-add";


    }

    @GetMapping("/update")
    public String updatePlayer(@RequestParam("playersId") Long id, Model model) {
        Optional<Player> player = playerRepository.findById(id);
        model.addAttribute("player", player);
        return "player-add";
    }

    @PostMapping("/save")
    public String addPlayer(@ModelAttribute("players") Player player) {
        playerRepository.save(player);
        return "players";
    }

    @GetMapping("/delete/{id}")
    public String deletePlayer(@PathVariable("id") Long id) {
        playerRepository.deleteById(id);
        return "player";
    }
    }






