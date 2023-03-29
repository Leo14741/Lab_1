package com.example.laboratorio1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String vistaLogin(){

        return "inicio_sesion";
    }

}