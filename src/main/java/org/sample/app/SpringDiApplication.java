package org.sample.app;

import org.sample.beans.printers.MessagePrinter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.sample.beans")
public class SpringDiApplication {
    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SpringDiApplication.class);
        MessagePrinter messagePrinter = annotationConfigApplicationContext.getBean(MessagePrinter.class);

        messagePrinter.print();
    }
}
