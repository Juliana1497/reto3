package com.reto.reto3.service;

import com.reto.reto3.model.CarModel;
import com.reto.reto3.model.MessageModel;
import com.reto.reto3.repository.CarRepository;
import com.reto.reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<MessageModel> obtener(){
        return messageRepository.findAll();
    }

    public void guardar(MessageModel message){
        messageRepository.save(message);
    }
}
