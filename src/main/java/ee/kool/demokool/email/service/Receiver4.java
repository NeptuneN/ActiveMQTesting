package ee.kool.demokool.email.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Receiver4
{
    @JmsListener(destination = "number", containerFactory = "jmsQueueFactory")
    public void receiveMessage(Double xNumber)
    {
        log.info("Original number is: "+ String.valueOf(Math.sqrt(xNumber) / 5));
    }

}
