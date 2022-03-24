package com.rubach.lesson_journal_server.appuser.mapper;

import com.rubach.lesson_journal_server.appuser.dto.AppUserDto;
import com.rubach.lesson_journal_server.appuser.model.AppUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AppUserMapper {

    @Mapping(source = "address.city", target = "city")
    @Mapping(source = "address.streetName", target = "streetName")
    @Mapping(source = "address.buildingNumber", target = "buildingNumber")
    @Mapping(source = "address.apartamentNumber", target = "apartamentNumber")
    AppUserDto mapToAppUserDto(AppUser appUser);

    @Mapping(source = "city",target = "address.city")
    @Mapping(source = "streetName", target = "address.streetName")
    @Mapping(source = "buildingNumber", target = "address.buildingNumber")
    @Mapping(source = "apartamentNumber", target = "address.apartamentNumber")
    AppUser mapToAppUser(AppUserDto appUserDto);

}
