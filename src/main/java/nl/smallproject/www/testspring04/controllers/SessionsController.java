package nl.smallproject.www.testspring04.controllers;

import nl.smallproject.www.testspring04.models.Session;
import nl.smallproject.www.testspring04.repositories.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addSession")
    public Session create(@RequestBody final Session session) {
        return sessionRepository.saveAndFlush(session);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        sessionRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Session update(Long id, Session session) {
        Session existingSession = sessionRepository.getReferenceById(id);
        BeanUtils.copyProperties(session, existingSession, "id");
        return sessionRepository.saveAndFlush(existingSession);
    }
}
