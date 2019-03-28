package ee.taltech.spring.bookit.controller;

import ee.taltech.spring.bookit.domain.User;
import ee.taltech.spring.bookit.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

@Controller
public class ExampleController {

    @Resource
    UserService service;

    @GetMapping("/{id}")
    public String hello(Model model, @PathVariable Long id) {
        User user = service.getUserById(id);
        model.addAttribute(user);
        return "index";
    }
}
