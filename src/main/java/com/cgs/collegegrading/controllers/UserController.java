package com.cgs.collegegrading.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "login_page";
    }
}
