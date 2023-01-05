package com.example.springSecurity.application.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {	
	@RequestMapping(value = "/")
    public String index(){
        return "index.html";
    }
}
