package com.rubach.lesson_journal_server.appuser.service;

import com.rubach.lesson_journal_server.appuser.dto.AppUserDto;
import com.rubach.lesson_journal_server.appuser.model.AppUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface AppUserService {

    AppUserDto createAppUser(AppUserDto appUserDto);
    Page<AppUserDto> getAppUsers(Specification<AppUser> appUserSpecification, Pageable pageable);

}
