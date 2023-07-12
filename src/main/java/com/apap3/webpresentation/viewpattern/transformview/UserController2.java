package com.apap3.webpresentation.viewpattern.transformview;

/**
 * @author muhammad.khadafi
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController2 {

    @GetMapping("/user2")
    public User getUser() {
        return new User("John Doe", "johndoe@example.com");
    }
}
