package com.rubach.lesson_journal_server.common.enumerations;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {
    private String city;
    private String streetName;
    private String buildingNumber;
    private String apartamentNumber;
}
