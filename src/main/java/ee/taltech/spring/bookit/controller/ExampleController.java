package ee.taltech.spring.bookit.controller;

import ee.taltech.spring.bookit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("")
    public String hello(Model model) {
        User user = new User("1", "kassu", 15);
        model.addAttribute(user);
        return "index";
    }
}
