package com.tbemerencio.circuit_braker_exemple.facade;

import com.tbemerencio.circuit_braker_exemple.domain.Movie;
import com.tbemerencio.circuit_braker_exemple.integration.note.domain.MovieNote;
import com.tbemerencio.circuit_braker_exemple.integration.note.service.NoteService;
import com.tbemerencio.circuit_braker_exemple.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MovieFacade {

    private final MovieService movieService;
    private final NoteService noteService;

    public Movie getMovieInfo(Long id) {
        Movie movie = movieService.getMovieById(id);
        MovieNote movieNote = noteService.getMovieNote(id);
        movie.setNote(movieNote.getNote());
        return movie;
    }
}
