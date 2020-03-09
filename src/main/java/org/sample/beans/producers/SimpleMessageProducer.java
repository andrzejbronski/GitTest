package org.sample.beans.producers;

import org.sample.beans.producers.MessageProducer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SimpleMessageProducer")
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage(){
        String message="";
        return "message "+ System.currentTimeMillis();
    }
}
