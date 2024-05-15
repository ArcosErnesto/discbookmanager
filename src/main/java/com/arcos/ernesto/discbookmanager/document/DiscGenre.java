package com.arcos.ernesto.discbookmanager.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "discGenres")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DiscGenre {
    @Id
    private String id;

    @NotEmpty
    @JsonProperty("discGenreName")
    private String discGenreName;

    public DiscGenre(String discGenreName) {
        this.discGenreName = discGenreName;
    }
}
