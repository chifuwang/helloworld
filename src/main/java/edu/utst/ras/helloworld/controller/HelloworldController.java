package edu.utst.ras.helloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/helloworld")
    public ResponseEntity<String> helloworld() {
        return ResponseEntity.ok("Hello World");
    }
}
