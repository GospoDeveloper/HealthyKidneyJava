package com.example.gospo.HealthyKidneyApp.service;

import com.example.gospo.HealthyKidneyApp.model.FormularNutritional;
import com.example.gospo.HealthyKidneyApp.model.User;
import com.example.gospo.HealthyKidneyApp.repository.FormularNutritionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.text.Normalizer;
import java.util.List;
import java.util.Optional;

@Service
public class FormularNutritionalService {
    @Autowired
    private FormularNutritionalRepository formularNutritionalRepository;

    @Autowired
    private UserServiceImpl userServiceImpl;

    public void saveFormularNutritional(FormularNutritional formularNutritional){
        this.formularNutritionalRepository.save(formularNutritional);
    }


}
