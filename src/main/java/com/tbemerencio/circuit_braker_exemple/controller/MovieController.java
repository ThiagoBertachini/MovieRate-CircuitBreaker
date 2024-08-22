package com.tbemerencio.circuit_braker_exemple.controller;

import com.tbemerencio.circuit_braker_exemple.domain.Movie;
import com.tbemerencio.circuit_braker_exemple.facade.MovieFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("movies")
public class MovieController {

    private final MovieFacade movieFacade;

    @GetMapping("/{id}")
    Movie getMovieInfo(@PathVariable(value = "id") Long id) {
        return movieFacade.getMovieInfo(id);
    }
}