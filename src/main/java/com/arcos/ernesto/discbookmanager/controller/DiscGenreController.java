package com.arcos.ernesto.discbookmanager.controller;

import com.arcos.ernesto.discbookmanager.dto.DiscGenreDTO;
import com.arcos.ernesto.discbookmanager.service.DiscGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/discbook/v1/discGenres")
public class DiscGenreController {
    @Autowired
    DiscGenreService discGenreService;

    @GetMapping(value = "/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Greetings from DiscGenreController!");
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<Flux<DiscGenreDTO>> getAll() {
        Flux<DiscGenreDTO> discGenres = discGenreService.getAllDiscGenres();
        return ResponseEntity.ok(discGenres);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Mono<DiscGenreDTO>> addDiscGenre(@RequestBody DiscGenreDTO discGenreDTO) {
        return ResponseEntity.ok(discGenreService.saveDiscGenre(discGenreDTO));
    }
}
