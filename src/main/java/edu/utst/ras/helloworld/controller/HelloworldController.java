package edu.utst.ras.helloworld.controller;

import edu.utst.ras.helloworld.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class HelloworldController {

    @GetMapping("/helloworld")
    public ResponseEntity<String> helloworld() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/api/v1/movies")
    public ResponseEntity<List<Movie>> getMovies() {
        List<Movie> movieList = new ArrayList<>();

        Movie m1 = new Movie("Title One", 1, new Date());
        Calendar c = Calendar.getInstance();
        c.set(2022,2,11);
        Movie m2 = new Movie("Title Two", 3, c.getTime());

        movieList.add(m1);
        movieList.add(m2);

        return ResponseEntity.ok(movieList);

    }
}
