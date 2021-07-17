package com.teams.Controller;

import com.teams.Dto.NationalTeamsDto;
import com.teams.Entities.NationalTeams;
import com.teams.Repository.NationalTeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

//    @GetMapping("/nationalTeams/add")
//    @Secured("ROLE_USER")
//    public String showNationalTeams(NationalTeamsDto nationalTeamsDto) {
//        nationalTeamsDto.setName((List<NationalTeams>) nationalTeamsRepository.findAll());
//        return "nationalTeam-add";
//    }

    @GetMapping("/nationalTeams/add")
    public String addNationalTeam(Model model) {
        NationalTeams nationalTeams = new NationalTeams();
        model.addAttribute("nationalTeams", nationalTeams);
        return "nationalTeams-add";

    }

    @PostMapping("/nationalTeams/addTeam")
    public String addTeam(@ModelAttribute ("nationalTeams") NationalTeams nationalTeams){
        nationalTeamsRepository.save(nationalTeams);
        return "nationalTeams";
    }
}











