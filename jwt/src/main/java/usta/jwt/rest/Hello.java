package usta.jwt.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class Hello {
    @RequestMapping("hello")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }
}
