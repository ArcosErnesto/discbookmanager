package com.arcos.ernesto.discbookmanager.repository;

import com.arcos.ernesto.discbookmanager.document.DiscGenre;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface DiscGenreRepository extends ReactiveMongoRepository<DiscGenre, String>{
    Mono<Boolean> existsByDiscGenreName(String discGenreName);
}
