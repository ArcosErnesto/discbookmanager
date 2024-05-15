package com.arcos.ernesto.discbookmanager.service;

import com.arcos.ernesto.discbookmanager.dto.DiscGenreDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DiscGenreService {
    Flux<DiscGenreDTO> getAllDiscGenres();

    Flux<DiscGenreDTO> getDiscGenreById(String id);

    DiscGenreDTO getDiscGenreByName(DiscGenreDTO discGenreDTO);

    Mono<DiscGenreDTO> saveDiscGenre(DiscGenreDTO discGenreDTO);

    Flux<DiscGenreDTO> updateDiscGenre(String id, DiscGenreDTO discGenreDTO);

    Flux<DiscGenreDTO> deleteDiscGenre(String id);

}
