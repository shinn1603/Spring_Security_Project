package vn.yain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @org.springframework.web.bind.annotation.RequestMapping("/access-denied")
    public String accessDenied() {
        return "error/403";
    }
}
