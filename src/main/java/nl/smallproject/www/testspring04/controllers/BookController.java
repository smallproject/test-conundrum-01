package nl.smallproject.www.testspring04.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/api/test/bookcontroller")
    public String getString() {
        return "Hello World, this is a book library";
    }
}
