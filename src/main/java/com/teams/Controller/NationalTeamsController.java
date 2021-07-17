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

    @GetMapping("/nationalTeams/add")
    @Secured("ROLE_ADMIN")
    public String showNationalTeams(NationalTeamsDto nationalTeamsDto){
        nationalTeamsDto.setName((List<NationalTeams>)nationalTeamsRepository.findAll());
        return "nationalTeam-add";
    }

    @PostMapping("nationalTeams/add")
    @Secured("ROLE_ADMIN")
    public String addNationalTeam(@Validated NationalTeamsDto nationalTeamsDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "nationalTeam-add";}
        return null;
    }

//   NationalTeamsRepository.save(
//
//    void convertDtoToEntity(NationalTeams);
//    model.addAttribute("nationalTeams", NationalTeamsRepository.findAll());
//    return "nationalTeams";

}











