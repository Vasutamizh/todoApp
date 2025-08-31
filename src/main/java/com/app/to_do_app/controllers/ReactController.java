package com.app.to_do_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReactController {
    @GetMapping({"/", "/{path:^[a-zA-Z0-9-]*$}"})
    public String reactHomePage(){
        return "forward:/index.html";
   }
}
