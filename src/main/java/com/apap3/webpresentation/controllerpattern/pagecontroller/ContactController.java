package com.apap3.webpresentation.controllerpattern.pagecontroller;

/**
 * @author muhammad.khadafi
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    @GetMapping("/contact")  // handler untuk GET request
    public String showHomePage(Model model) {
        model.addAttribute("message", "Welcome to the Contact Page!");
        return "contact";
    }

    @PostMapping("/submitForm")  // handler untuk POST request (misalnya, dari form submission)
    public String handleFormSubmission(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", "Thank you, " + name + ", your form has been submitted!");
        return "result";
    }

    @PutMapping("/submitForm")  // handler untuk POST request (misalnya, dari form submission)
    public String handleFormSubmissionUpdate(@RequestParam("name") String name, Model model) {
        return "update success";
    }

    @DeleteMapping("/submitForm")  // handler untuk POST request (misalnya, dari form submission)
    public String handleFormSubmissionDelete(@RequestParam("name") String name, Model model) {
        return "delete success";
    }
}

