package com.apap3.webpresentation.viewpattern.templateview;

/**
 * @author muhammad.khadafi
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String showUser(Model model) {
        User user = new User("John Doe", "johndoe@example.com");
        model.addAttribute("user", user);
        return "user"; // Ini merujuk ke template "user.html"
    }
}

