package com.lixygomez.liberafrutas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/juego")
    public String juego() {
        return "redirect:/index.html";
    }

    @GetMapping("/inicio")
    public String inicio() {
        return "redirect:/index.html";
    }
}