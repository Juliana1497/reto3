package com.reto.reto3.service;

import com.reto.reto3.model.CarModel;
import com.reto.reto3.model.ClientModel;
import com.reto.reto3.repository.CarRepository;
import com.reto.reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> obtener(){
        return clientRepository.findAll();
    }

    public void guardar(ClientModel client){
        clientRepository.save(client);
    }
}
