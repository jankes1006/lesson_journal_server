package com.rubach.lesson_journal_server.appuser.model;

import com.rubach.lesson_journal_server.common.enumerations.Address;
import com.rubach.lesson_journal_server.common.enumerations.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APP_USER_GENERATOR")
    @SequenceGenerator(name="APP_USER_GENERATOR", sequenceName = "APP_USER_SEQUENCE", allocationSize=1)
    private Long id;
    private String firstName;
    private String secondName;
    private String personalIdNumber;
    private String phoneNumber;
    @Embedded
    private Address address;
    private UserRole role;
}
