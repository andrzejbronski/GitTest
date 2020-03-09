package org.sample.beans.producers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Producer(type = Producer.ProducerType.SIMPLE)
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage(){
        String message="";
        return "message "+ System.currentTimeMillis();
    }
}
