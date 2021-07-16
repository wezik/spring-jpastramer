package com.example.jpastreamer.controller;

import com.example.jpastreamer.domain.Movie;
import com.example.jpastreamer.service.MovieDBService;
import com.speedment.jpastreamer.application.JPAStreamer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
@RequestMapping("v1")
@RequiredArgsConstructor
public class Controller {

    private final JPAStreamer jpaStreamer;
    private final MovieDBService movieDBService;

    @GetMapping("filter")
    public List<Movie> test() {
        return jpaStreamer.stream(Movie.class).filter(e -> e.getTitle().length()>4).collect(Collectors.toList());
    }

    @GetMapping("get")
    public List<Movie> all() {
        return movieDBService.getAll();
    }

    @PostMapping("add")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieDBService.save(movie);
    }

}
