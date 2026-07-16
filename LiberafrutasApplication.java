package com.lixygomez.liberafrutas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller  // ← CAMBIÉ ESTO (era @RestController)
public class LiberafrutasApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiberafrutasApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/index.html";  // ← ESTO AHORA FUNCIONA
    }
}