package com.kdb.enrichment.model.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Parameters {


    NAME("Nome"),
    REGISTRATION("Matricula"),
    BIRTH_DATE("Data nascimento"),
    MOTHER_NAME("Nome da mae"),
    OFFICE("Cargo"),
    INSURANCE("Convenio");

    private String  shortName;

}
