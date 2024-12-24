package com.controller;

import com.model.User;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user-form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/save-form")
    public String saveForm(@Valid @ModelAttribute("user") User user, Model model,
                           BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        userService.save(user);
        return "result";
    }
}
