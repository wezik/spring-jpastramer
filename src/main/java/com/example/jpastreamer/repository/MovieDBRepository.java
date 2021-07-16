package com.example.jpastreamer.repository;

import com.example.jpastreamer.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDBRepository extends CrudRepository<Movie, Long> {
    List<Movie> findAll();
}
