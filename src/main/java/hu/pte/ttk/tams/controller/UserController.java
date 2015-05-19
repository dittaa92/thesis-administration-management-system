package hu.pte.ttk.tams.controller;

import hu.pte.ttk.tams.model.domain.User;
import hu.pte.ttk.tams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public User getUser() {
        return userService.getUser("Forgács", "Judit");
    }
}
