package com.apap3.webpresentation.controllerpattern.frontcontroller;

/**
 * @author muhammad.khadafi
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class JobsController {

    @PostMapping("/jobs")  // handler untuk POST request (misalnya, dari form submission)
    public String handleFormSubmission(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", "Thank you, " + name + ", your form has been submitted!");
        return "result";
    }

    @PutMapping("/jobs")  // handler untuk POST request (misalnya, dari form submission)
    public String handleFormSubmissionUpdate(@RequestParam("name") String name, Model model) {
        return "update success";
    }

    @DeleteMapping("/jobs")  // handler untuk POST request (misalnya, dari form submission)
    public String handleFormSubmissionDelete(@RequestParam("name") String name, Model model) {
        return "delete success";
    }
}

