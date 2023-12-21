package com.example.rabbitmq;

import com.example.rabbitmq.producer.HelloSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoRabbitmqApplicationTests {

    @Autowired
    private HelloSender helloSender;

    @Test
    void contextLoads() {


        helloSender.send();

    }

}
