package com.voiceofthecustomer.voiceofthecustomer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {

    @GetMapping("/form")
    public String showFormPage(Model model) {
        return "form";
    }

    @GetMapping("/statistics")
    public String showStatisticsPage(Model model) {
        return "statistics";
    }


}
