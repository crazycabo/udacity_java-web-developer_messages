package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.datasource.MessageMapper;
import com.udacity.jwdnd.c1.review.model.ChatMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageMapper messageMapper;

    public MessageService(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    public void addMessage(String message, String messageType, String username) {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setUsername(username);

        switch (messageType) {
            case "Say" -> chatMessage.setMessageText(message);
            case "Shout" -> chatMessage.setMessageText(message.toUpperCase());
            case "Whisper" -> chatMessage.setMessageText(message.toLowerCase());
            default -> chatMessage.setMessageText(message);
        }

        messageMapper.insertMessage(chatMessage);
    }

    public List<ChatMessage> getChatMessages() {
        return messageMapper.getAllMessages();
    }
}
