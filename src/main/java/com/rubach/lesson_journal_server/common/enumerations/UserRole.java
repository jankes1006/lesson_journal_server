package com.rubach.lesson_journal_server.common.enumerations;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("Administrator"),
    TEACHER("Nauczyciel"),
    STUDENT("Student");

    private String nameRole;

    UserRole(String nameRole) {
        this.nameRole = nameRole;
    }
}
