package com.arcos.ernesto.discbookmanager.repository;

import com.arcos.ernesto.discbookmanager.document.Disc;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface DiscRepository extends ReactiveMongoRepository<Disc, String>{

}
