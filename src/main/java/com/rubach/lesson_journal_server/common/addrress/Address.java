package com.rubach.lesson_journal_server.common.enumerations;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String city;
    private String streetName;
    private String buildingNumber;
    private String apartamentNumber;
}
