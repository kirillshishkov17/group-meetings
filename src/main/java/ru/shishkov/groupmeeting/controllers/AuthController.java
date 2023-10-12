package ru.shishkov.groupmeeting.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.shishkov.groupmeeting.models.Person;
import ru.shishkov.groupmeeting.services.PersonService;
import ru.shishkov.groupmeeting.utils.PersonUtils;

@Controller
public class AuthController {
    private final PersonService personService;
    private final PersonUtils personUtils;

    @Autowired
    public AuthController(PersonService personService, PersonUtils personUtils) {
        this.personService = personService;
        this.personUtils = personUtils;
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("person", new Person());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("person") Person person) {
        personService.savePerson(person);
        return "redirect:/index";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("person", new Person());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("person") Person person) {
        // TODO Доработать логику авторизации
        Boolean isChecked = personUtils.checkAuth(person);
        if (!isChecked) {
            return "redirect:/login";
        }
        return "redirect:/index";
    }
}
