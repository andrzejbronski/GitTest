package org.sample.beans;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage(){
        String message="";
        return "message "+ System.currentTimeMillis();
    }
}
