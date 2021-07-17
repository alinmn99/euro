package com.teams.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TeamBasementController {

    @Autowired
   TeamBasementRepository teamBasementRepository;

    @GetMapping("/teambasement")
    public long shotTeamBasement (Model model) {
        List<TeamBasement>teamBasementList = (List<TeamBasement>) teamBasementRepository.findAll();
        model.addAttribute("teamBasement",teamBasementList);
        return Long.parseLong("teamBasement");
    }
}

