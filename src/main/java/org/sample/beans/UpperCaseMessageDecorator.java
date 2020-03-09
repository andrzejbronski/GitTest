package org.sample.beans;

import org.springframework.stereotype.Component;

@Component
public class UpperCaseMessageDecorator implements MessageDecorator{
    @Override
    public String decorate(String msg) {
        return msg.toUpperCase();
    }
}
