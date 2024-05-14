package com.arcos.ernesto.discbookmanager.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@RequiredArgsConstructor
public class Disc {
    @Id
    @JsonProperty("id")
    private String id;

    @NotEmpty
    @JsonProperty("discName")
    private String discName;

    @NotEmpty
    @JsonProperty("discArtist")
    private String discArtist;

    @NotEmpty
    @JsonProperty("discYear")
    private int discYear;

    @NotEmpty
    @JsonProperty("discGenres")
    private List<DiscGenre> discGenres;

    @NotEmpty
    @JsonProperty("discFormat")
    private String discFormat;

    @NotEmpty
    @JsonProperty("discOwner")
    private String discOwner;

    @JsonProperty("discImage")
    private String discImage;
}
