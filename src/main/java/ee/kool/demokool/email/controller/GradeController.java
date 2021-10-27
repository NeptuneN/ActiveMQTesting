package ee.kool.demokool.email.controller;
import ee.kool.demokool.email.Grade;
import ee.kool.demokool.email.service.GradeSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GradeController {

    @Autowired
    GradeSender gradeSender;

    @PostMapping(path = "/v1/grades",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Grade newStudent)
    {
        gradeSender.sendGrade(newStudent);
    }
}
