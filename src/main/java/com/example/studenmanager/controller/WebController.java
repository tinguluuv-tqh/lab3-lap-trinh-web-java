package com.example.studenmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping({"/", "/students"})
    public String studentsPage() {
        return "students";
    }
}