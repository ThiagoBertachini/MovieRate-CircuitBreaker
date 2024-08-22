package com.tbemerencio.circuit_braker_exemple.integration.note.client;

import com.tbemerencio.circuit_braker_exemple.integration.note.domain.MovieNote;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "noteClient", url = "http://url.note")
public interface NoteClient {

    @GetMapping(value = "/note/{id}")
    ResponseEntity<MovieNote> getMovieNote(@PathVariable Long id);
}
