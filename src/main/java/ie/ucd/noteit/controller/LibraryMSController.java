package ie.ucd.noteit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryMSController {
    int count = 0;
    @GetMapping("/")
    public String home() {
        return "index.html";
    }
    @GetMapping("/signup")
    public String signup() {
        return "signup.html";
    }
    @GetMapping("/signin")
    public String create() {
        return "signin.html";
    }
    @GetMapping("/books")
    public String books() {
        return "books.html";
    }
    @GetMapping("/view")
    public String view() {
        return "view.html";
    }
}