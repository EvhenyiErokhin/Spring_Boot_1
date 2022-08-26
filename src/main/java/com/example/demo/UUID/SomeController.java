package com.example.demo.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SomeController {
    @GetMapping("/")
    public String Text(Model model){
        model.addAttribute("text", "very importent text");
        return "text";
    }
}
