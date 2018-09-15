package de.sdsd.projekt.GeoDemo.controller.ui;

import de.sdsd.projekt.GeoDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public String userPage(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.userDetails(id));
        return "user";
    }
}
