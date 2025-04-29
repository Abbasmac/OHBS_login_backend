package com.springboot.login.controller;

import com.springboot.login.dto.AdminSignupDTO;
import com.springboot.login.dto.AdminLoginDTO;
import com.springboot.login.entity.Admin;
import com.springboot.login.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/signup")
    public String signup(@RequestBody AdminSignupDTO signupDTO) {
        return adminService.registerAdmin(signupDTO);
    }

    @GetMapping("/all")
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @PostMapping("/login")
    public String login(@RequestBody AdminLoginDTO loginDTO) {
        return adminService.loginAdmin(loginDTO);
    }
}