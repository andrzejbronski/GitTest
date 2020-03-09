package org.sample.beans.printers;

import org.sample.beans.decorators.MessageDecorator;
import org.sample.beans.producers.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private MessageProducer messageProducer;
    private MessageDecorator messageDecorator;

    public MessagePrinter(){}

    @Autowired
    public MessagePrinter(@Qualifier("FileMessageProducer") MessageProducer messageProducer){
        this.messageProducer = messageProducer;
    }

    public MessageProducer getMessageProducer(){
        return messageProducer;
    }

    public void setMessageProducer(MessageProducer messageProducer){
        this.messageProducer = messageProducer;
    }
    @Autowired
    public void setMessageDecorator(@Qualifier("UpperCaseMessageDecorator") MessageDecorator messageDecorator){
        this.messageDecorator = messageDecorator;
    }
    public void print(){
        String msg = messageProducer.getMessage();
        msg = messageDecorator != null ? messageDecorator.decorate(msg) : msg;
        System.out.println(msg);
    }

}
