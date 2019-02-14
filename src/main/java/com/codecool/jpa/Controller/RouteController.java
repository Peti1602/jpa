package com.codecool.jpa.Controller;

import com.codecool.jpa.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {

    @Autowired
    private ShowService showService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("title", "All Shows");
        model.addAttribute("shows", showService.getAllShows());
        return "index";
    }

}
