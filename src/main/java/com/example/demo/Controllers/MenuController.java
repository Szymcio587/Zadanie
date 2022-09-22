package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MenuController {

    @GetMapping("/")
    String Menu() {
        return "index";
    }

    @GetMapping("/index")
    String Menuu() {
        return "index";
    }
}
