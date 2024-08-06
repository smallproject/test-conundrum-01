package nl.smallproject.www.testspring04.controllers;

import nl.smallproject.www.testspring04.models.Session;
import nl.smallproject.www.testspring04.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

//    @GetMapping("/api/v1/sessions/string")
//    public String getString() {
//        return "Sessions controller, return string";
//    }

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getReferenceById(id);
    }
}
