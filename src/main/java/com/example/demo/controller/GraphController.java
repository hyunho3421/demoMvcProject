package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/graph/")
public class GraphController {

    @GetMapping("graph")
    public String graph() {
        

        return "graph/graph";
    }
}
