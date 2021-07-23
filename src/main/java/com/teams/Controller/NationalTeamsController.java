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
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/nationalTeams")
public class NationalTeamsController {

    @Autowired
    NationalTeamsRepository nationalTeamsRepository;

    @GetMapping("/list")
    public String getNationalTeams(Model model) {
        List<NationalTeams> nationalTeams = nationalTeamsRepository.findAll();
        model.addAttribute("nationalTeams", nationalTeams);
        return "nationalTeams";
    }

//    @GetMapping("/nationalTeams/add")
//    @Secured("ROLE_USER")
//    public String showNationalTeams(NationalTeamsDto nationalTeamsDto) {
//        nationalTeamsDto.setName((List<NationalTeams>) nationalTeamsRepository.findAll());
//        return "nationalTeam-add";
//    }

    @GetMapping("/add")
    public String addNationalTeam(Model model) {
        NationalTeams nationalTeams = new NationalTeams();
        model.addAttribute("nationalTeams", nationalTeams);
        return "nationalTeams-add";
    }


    @GetMapping("/update")
    public String updateNationalTeam(@RequestParam("nationalTeamId") Long id, Model model) {
        Optional<NationalTeams> nationalTeams = nationalTeamsRepository.findById(id);
        model.addAttribute("nationalTeams", nationalTeams);
        return "nationalTeams-add";
    }

    @PostMapping("/save")
    public String addTeam(@ModelAttribute("nationalTeams") NationalTeams nationalTeams) {
        nationalTeamsRepository.save(nationalTeams);
        return "nationalTeams";
    }

    @GetMapping("/delete/{id}")
    public String deleteTeam(@PathVariable("id") Long id) {
        nationalTeamsRepository.deleteById(id);
        return "nationalTeams";
    }
}
//    @PostMapping("/delete")
//    public String deleteTeam(@PathVariable("nationalTeams") long id, Model model) {
//        NationalTeams nationalTeams = nationalTeamsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        nationalTeamsRepository.delete(nationalTeams);
//        model.addAttribute("nationalTeams", nationalTeamsRepository.findAll());
//        return "nationalTeams";
//    }
//}











