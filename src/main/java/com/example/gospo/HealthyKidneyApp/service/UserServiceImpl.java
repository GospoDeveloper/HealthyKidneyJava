package com.example.gospo.HealthyKidneyApp.service;

import com.example.gospo.HealthyKidneyApp.model.FormularNutritional;
import com.example.gospo.HealthyKidneyApp.model.Role;
import com.example.gospo.HealthyKidneyApp.model.User;
import com.example.gospo.HealthyKidneyApp.repository.UserRepository;
import com.example.gospo.HealthyKidneyApp.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user = new User(userRegistrationDto.getFirstName(), userRegistrationDto.getLastName(), userRegistrationDto.getEmail(), passwordEncoder.encode(userRegistrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")),new FormularNutritional());
        return userRepository.save(user);
    }

    public Long getUserIdByUsername(String username) {
        // Implement logic to retrieve user ID by username from your UserRepository
        // This is just a placeholder, replace it with your actual implementation
        User user = userRepository.findByEmail(username);
        if (user != null) {
            return user.getId(); // Assuming getId() returns the user ID
        } else {
            return null; // or handle appropriately if user not found
        }
    }

    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated() && authentication.getPrincipal() instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            String username = userDetails.getUsername();
            return userRepository.findByEmail(username);
        }
        return null;
    }

    public FormularNutritional getUserForm(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        return (user != null) ? user.getForm(): null;
    }


    public FormularNutritional getFormularByUserId(long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return user.getForm();
        } else {
            throw new RuntimeException("User not found for id: " + userId);
        }
    }
}
