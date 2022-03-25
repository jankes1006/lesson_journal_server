package com.rubach.lesson_journal_server.appuser.dto;

import com.rubach.lesson_journal_server.common.enumerations.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUserDto {

    private Long id;
    private String firstName;
    private String secondName;
    private String personalIdNumber;
    private String phoneNumber;
    private String city;
    private String streetName;
    private String buildingNumber;
    private String apartamentNumber;
    private UserRole role;

}
