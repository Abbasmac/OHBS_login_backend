package com.springboot.login.controller;

import com.springboot.login.dto.ManagerSignupDTO;
import com.springboot.login.dto.ManagerLoginDTO;
import com.springboot.login.entity.Manager;
import com.springboot.login.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/signup")
    public String signup(@RequestBody ManagerSignupDTO signupDTO) {
        return managerService.registerManager(signupDTO);
    }

    @GetMapping("/all")
    public List<Manager> getAllManagers() {
        return managerService.getAllManagers();
    }

    @PostMapping("/login")
    public String login(@RequestBody ManagerLoginDTO loginDTO) {
        return managerService.loginManager(loginDTO);
    }
}