package com.arcos.ernesto.discbookmanager.service;

import com.arcos.ernesto.discbookmanager.dto.DiscGenreDTO;
import reactor.core.publisher.Flux;

public interface DiscGenreService {
    Flux<DiscGenreDTO> getAllDiscGenres();

    Flux<DiscGenreDTO> getDiscGenreById(String id);

    Flux<DiscGenreDTO> getDiscGenreByName(String genreName);

    Flux<DiscGenreDTO> saveDiscGenre(DiscGenreDTO discGenreDTO);

    Flux<DiscGenreDTO> updateDiscGenre(String id, DiscGenreDTO discGenreDTO);

    Flux<DiscGenreDTO> deleteDiscGenre(String id);

}
