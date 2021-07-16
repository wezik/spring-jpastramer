package com.example.jpastreamer.service;

import com.example.jpastreamer.domain.Movie;
import com.example.jpastreamer.repository.MovieDBRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieDBService {

    private final MovieDBRepository movieDBRepository;

    public Movie save(Movie movie) {
        return movieDBRepository.save(movie);
    }

    public List<Movie> getAll() {
        return movieDBRepository.findAll();
    }

}
