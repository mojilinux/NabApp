package io.github.mojilinux.nabApp.web.controller;

import io.github.mojilinux.nabApp.model.User;
import io.github.mojilinux.nabApp.services.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "/index")
public class LoginController {

    @Autowired
    private ILoginService iLoginService;

    @GetMapping("/signup")
    public String getIndex() {
        return "register";
    }

    @PostMapping(value = "/register")
    public String register(User user){
        iLoginService.save(user);
        return "register_success";
    }


}
