package com.arcos.ernesto.discbookmanager.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@RequiredArgsConstructor
public class DiscGenre {
    @Id
    private String id;

    @NotEmpty
    @JsonProperty("discGenreName")
    private String discGenreName;
}
