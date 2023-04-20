package com.reto.reto3.service;

import com.reto.reto3.model.AdminModel;
import com.reto.reto3.model.CarModel;
import com.reto.reto3.repository.AdminRepository;
import com.reto.reto3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public List<AdminModel> obtener(){
        return adminRepository.findAll();
    }

    public void guardar(AdminModel admin){
        adminRepository.save(admin);
    }
}
