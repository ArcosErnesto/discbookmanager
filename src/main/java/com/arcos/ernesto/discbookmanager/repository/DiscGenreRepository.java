package com.arcos.ernesto.discbookmanager.repository;

import com.arcos.ernesto.discbookmanager.document.DiscGenre;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DiscGenreRepository extends ReactiveMongoRepository<DiscGenre, String>{
}
