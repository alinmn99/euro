package com.teams.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultsController {


    @GetMapping("/groups")
    public void getAllResults(Model model){}


    @GetMapping("/results")
    public void getAllResults2(Model model){}
}


