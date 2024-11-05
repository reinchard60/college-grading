package com.cgs.collegegrading.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/","", "index", "/menu"})
    public String getIndex() {
        return "index";
    }
}
