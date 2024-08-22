package com.tbemerencio.circuit_braker_exemple.service;

import com.tbemerencio.circuit_braker_exemple.domain.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieService {


    public Movie getMovieById(Long id) {
        // Find movie in DB
        Movie movie = new Movie();
        return movie;
    }
}
