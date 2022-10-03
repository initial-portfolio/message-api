package message.email.apimessageemail.controllers;

import message.email.apimessageemail.dtos.MessageDto;
import message.email.apimessageemail.models.MessageModel;
import message.email.apimessageemail.services.MessageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping("/sending-email")
    public ResponseEntity<MessageModel> sendingEmail(@RequestBody @Valid MessageDto messageDto) throws Exception {
        MessageModel messageModel = new MessageModel();
        BeanUtils.copyProperties(messageDto, messageModel);
        messageService.sendMessage(messageModel);
        return new ResponseEntity<>(messageModel, HttpStatus.CREATED);
    }
}
