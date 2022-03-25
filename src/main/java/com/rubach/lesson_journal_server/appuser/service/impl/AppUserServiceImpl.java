package com.rubach.lesson_journal_server.appuser.service.impl;

import com.rubach.lesson_journal_server.appuser.dto.AppUserDto;
import com.rubach.lesson_journal_server.appuser.mapper.AppUserMapper;
import com.rubach.lesson_journal_server.appuser.model.AppUser;
import com.rubach.lesson_journal_server.appuser.repository.AppUserRepository;
import com.rubach.lesson_journal_server.appuser.service.AppUserService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class AppUserServiceImpl implements AppUserService {

    private final AppUserMapper appUserMapper;
    private final AppUserRepository appUserRepository;

    @Override
    public AppUserDto createAppUser(AppUserDto appUserDto) {
        var dataToSave = appUserMapper.mapToAppUser(appUserDto);
        return appUserMapper.mapToAppUserDto(appUserRepository.save(dataToSave));
    }

    @Override
    public Page<AppUserDto> getAppUsers(Specification<AppUser> appUserSpecification, Pageable pageable) {
        return appUserRepository.findAll(appUserSpecification,pageable).map(appUserMapper::mapToAppUserDto);
    }

}
