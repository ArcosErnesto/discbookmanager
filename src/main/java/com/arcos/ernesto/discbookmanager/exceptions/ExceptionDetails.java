package com.arcos.ernesto.discbookmanager.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ExceptionDetails {
    private String message;
    private int description;
}
