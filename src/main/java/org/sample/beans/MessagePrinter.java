package org.sample.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    @Autowired
    private MessageProducer messageProducer;

    public MessagePrinter(){}

    public MessagePrinter(MessageProducer messageProducer){
        this.messageProducer = messageProducer;
    }

    public MessageProducer getMessageProducer(){
        return messageProducer;
    }

    public void setMessageProducer(MessageProducer messageProducer){
        this.messageProducer = messageProducer;
    }
    public void print(){
        System.out.println(messageProducer.getMessage());
    }

}
