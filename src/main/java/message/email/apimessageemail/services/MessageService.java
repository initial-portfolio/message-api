package message.email.apimessageemail.services;


import message.email.apimessageemail.models.MessageModel;
import message.email.apimessageemail.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;



    public MessageModel sendMessage(MessageModel messageModel) throws Exception {

        try {
            messageModel.setCreatedAt(LocalDateTime.now());
            messageModel.setName(messageModel.getName());
            messageModel.setTelephone(messageModel.getTelephone());
            messageModel.setEmail(messageModel.getEmail());
            messageModel.setMessage(messageModel.getMessage());
            return messageRepository.save(messageModel);
        } catch (RuntimeException e) {
            throw new Exception(e.getMessage());
        }
    }}

