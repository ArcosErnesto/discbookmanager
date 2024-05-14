package com.arcos.ernesto.discbookmanager.service;


import com.arcos.ernesto.discbookmanager.dto.DiscDTO;
import com.arcos.ernesto.discbookmanager.dto.DiscGenreDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DiscService {
    Flux<DiscDTO> getAllDiscs();
    Mono<DiscDTO> getDiscById(String id);
    Flux<DiscDTO> getDiscByName(String name);
    Flux<DiscDTO> getDiscByArtist(String artist);
    Flux<DiscDTO> getDiscByGenre(DiscGenreDTO genre);
    Mono<DiscDTO> saveDisc(DiscDTO disc);
    Mono<DiscDTO> updateDisc(String id, DiscDTO disc);
    Mono<Void> deleteDisc(String id);

}
