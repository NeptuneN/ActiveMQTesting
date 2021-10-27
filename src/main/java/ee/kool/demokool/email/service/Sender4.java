package ee.kool.demokool.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class Sender4
{
    @Autowired
    JmsTemplate jmsTemplate;

    public void sendNumber(Double xNumber){
        jmsTemplate.convertAndSend("number", xNumber);
    }


}
