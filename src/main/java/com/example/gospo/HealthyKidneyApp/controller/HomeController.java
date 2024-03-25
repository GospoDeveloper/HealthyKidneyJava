package com.example.gospo.HealthyKidneyApp.controller;

import com.example.gospo.HealthyKidneyApp.model.FormularNutritional;
import com.example.gospo.HealthyKidneyApp.model.User;
import com.example.gospo.HealthyKidneyApp.model.UserPrincipal;
import com.example.gospo.HealthyKidneyApp.repository.FormularNutritionalRepository;
import com.example.gospo.HealthyKidneyApp.repository.UserRepository;
import com.example.gospo.HealthyKidneyApp.service.FormularNutritionalService;
import com.example.gospo.HealthyKidneyApp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.security.Principal;
import java.util.Collection;

@Controller
public class HomeController {

    @Autowired
    private FormularNutritionalService formularNutritionalService;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private FormularNutritionalRepository formularNutritionalRepository;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/formular")
    public String formular( Model model, Principal principal){

        // Retrieve the current logged-in user's username
        String email = principal.getName();
        System.out.println(email);

        // Find the user from the database based on the username
        User currentUser = userRepository.findByEmail(email);
        System.out.println(currentUser);

        // Retrieve the ID of the current user
        Long userId = currentUser.getId();
        System.out.println(userId);

        // Retrieve the formular nutritional associated with the current user's ID
        FormularNutritional formular = userService.getFormularByUserId(userId);
        System.out.println(formular.getId());
        System.out.println(formular);

        // Add the formular to the model
        model.addAttribute("formular", formular);

        return "formular";
    }

    @GetMapping("/formular_success")
    public String formularSuccess(){
        return "formular_success";

    }
}


