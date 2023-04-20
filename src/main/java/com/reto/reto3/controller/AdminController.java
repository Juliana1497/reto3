package com.reto.reto3.controller;

import com.reto.reto3.model.AdminModel;
import com.reto.reto3.model.GamaModel;
import com.reto.reto3.service.AdminService;
import com.reto.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/all")
    public List<AdminModel> obtener(){
        return adminService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody AdminModel admin){
        adminService.guardar(admin);
    }
}
