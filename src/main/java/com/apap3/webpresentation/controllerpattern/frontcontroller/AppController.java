package com.apap3.webpresentation.controllerpattern.frontcontroller;

/**
 * @author muhammad.khadafi
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping(value = "/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("message", "This is the Dashboard Page!");
        return "dashboard";
    }

    @RequestMapping(value = "/about")
    public String about(Model model) {
        model.addAttribute("message", "This is the About Page!");
        return "about";
    }
}
