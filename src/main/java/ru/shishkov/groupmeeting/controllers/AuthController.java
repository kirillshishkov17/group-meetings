package ru.shishkov.groupmeeting.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.shishkov.groupmeeting.controllers.models.User;

@Controller
public class AuthController {

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("user") User user) {
        System.out.println(user.getName() + " " + user.getLogin() + " " + user.getPassword());
        return "redirect:/index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
