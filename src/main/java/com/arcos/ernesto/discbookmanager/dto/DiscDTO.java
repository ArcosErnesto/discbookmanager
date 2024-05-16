package com.arcos.ernesto.discbookmanager.dto;

import com.arcos.ernesto.discbookmanager.document.DiscGenre;
import lombok.*;

import java.util.List;

@Getter
@Setter
public class DiscDTO {
    private String id;
    private String discName;
    private String discArtist;
    private int discYear;
    private List<DiscGenre> discGenres;
    private String discFormat;
    private String discOwner;
    private String discImage;

}
