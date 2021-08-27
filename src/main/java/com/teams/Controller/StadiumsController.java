package com.teams.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StadiumsController {

    @GetMapping("/stadiums")
    public void getAllStadiums(Model model){}
    }
