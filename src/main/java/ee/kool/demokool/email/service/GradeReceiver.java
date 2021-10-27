package ee.kool.demokool.email.service;

import ee.kool.demokool.email.Grade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GradeReceiver
{
    @JmsListener(destination = "päevik", containerFactory = "jmsQueueFactory")
    public void receiveMessage(Grade grade)
    {
        log.info("Info sent: " + grade);
    }

}
