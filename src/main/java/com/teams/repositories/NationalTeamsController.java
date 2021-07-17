package com.teams.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NationalTeamsController {

    @Autowired
    NationalTeamsRepository nationalTeamsRepository;

    @GetMapping("/nationalTeams")
    public String getNationalTeams(Model model) {
        List<NationalTeams> nationalTeams = (List<NationalTeams>) nationalTeamsRepository.findAll();
        model.addAttribute("nationalTeams", nationalTeams);
        return "nationalTeams";
    }



}
