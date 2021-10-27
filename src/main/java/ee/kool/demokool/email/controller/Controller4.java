package ee.kool.demokool.email.controller;
import ee.kool.demokool.email.service.Sender4;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller4 {

    @Autowired
    Sender4 sender4;

    @PostMapping(path = "/v1/numbers",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody double newNumber) {
        sender4.sendNumber(newNumber);

    }


}
