package com.tbemerencio.circuit_braker_exemple.integration.note.service;

import com.tbemerencio.circuit_braker_exemple.integration.note.client.NoteClient;
import com.tbemerencio.circuit_braker_exemple.integration.note.domain.MovieNote;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NoteService {

    private final NoteClient noteClient;

    @CircuitBreaker(name = "noteClient", fallbackMethod = "getFallBackMovieNote")
    public MovieNote getMovieNote(Long id){
        // Find movie note
        return noteClient.getMovieNote(id).getBody();
    }

    public MovieNote getFallBackMovieNote(Long id, Throwable throwable){
        // Retornar um movienote padrão, ou outra lógica de fallBack
        System.out.println("Erro ao buscar a nota do filme: " + throwable.getMessage());
        return new MovieNote();
    }
}
