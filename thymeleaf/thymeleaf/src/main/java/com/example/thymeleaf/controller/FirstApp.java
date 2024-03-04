package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstApp {
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        model.addAttribute("name", "Dilip Sunar"); // key-value pair

        System.out.println("------------------ hi there! -----------------------");

        return "about";
    }
}