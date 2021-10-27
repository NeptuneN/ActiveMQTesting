package ee.kool.demokool.email.service;

import ee.kool.demokool.email.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class GradeSender
{

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendGrade(Grade grade){
        jmsTemplate.convertAndSend("päevik", grade);
    }


}
