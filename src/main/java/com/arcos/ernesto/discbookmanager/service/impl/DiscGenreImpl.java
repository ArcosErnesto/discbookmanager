package com.arcos.ernesto.discbookmanager.service.impl;

import com.arcos.ernesto.discbookmanager.document.DiscGenre;
import com.arcos.ernesto.discbookmanager.dto.DiscGenreDTO;
import com.arcos.ernesto.discbookmanager.exceptions.DiscGenreAlreadyExistsException;
import com.arcos.ernesto.discbookmanager.repository.DiscGenreRepository;
import com.arcos.ernesto.discbookmanager.service.DiscGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DiscGenreImpl implements DiscGenreService {
    @Autowired
    DiscGenreRepository discGenreRepository;
    @Override
    public Flux<DiscGenreDTO> getAllDiscGenres() {
        return discGenreRepository.findAll().map(DiscGenreImpl::DiscGenreToDTO);
    }

    @Override
    public Flux<DiscGenreDTO> getDiscGenreById(String id) {
        return null;
    }

    @Override
    public DiscGenreDTO getDiscGenreByName(DiscGenreDTO discGenreDTO) {
                return null;
    }

    @Override
    public Mono<DiscGenreDTO> saveDiscGenre(DiscGenreDTO discGenreDTO) {
        String genreName = discGenreDTO.getDiscGenreName();
        return discGenreRepository.existsByDiscGenreName(genreName)
                .flatMap(exists -> {
                    if (exists) {
                        throw new DiscGenreAlreadyExistsException("Disc Genre already exists");
                    } else {
                        DiscGenre discGenre = new DiscGenre(genreName);
                        return discGenreRepository.save(discGenre)
                                .map(DiscGenreImpl::DiscGenreToDTO);
                    }
                });
    }

    @Override
    public Flux<DiscGenreDTO> updateDiscGenre(String id, DiscGenreDTO discGenreDTO) {
        return null;
    }

    @Override
    public Flux<DiscGenreDTO> deleteDiscGenre(String id) {
        return null;
    }

    public static DiscGenreDTO DiscGenreToDTO(DiscGenre discGenre) {
        return new DiscGenreDTO(discGenre.getId(), discGenre.getDiscGenreName());
    }

    public static DiscGenre DTOToDiscGenre(DiscGenreDTO discGenreDTO) {
        return new DiscGenre(discGenreDTO.getId(), discGenreDTO.getDiscGenreName());
    }
}
