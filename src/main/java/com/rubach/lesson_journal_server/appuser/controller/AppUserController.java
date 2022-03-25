package com.rubach.lesson_journal_server.appuser.controller;

import com.rubach.lesson_journal_server.appuser.dto.AppUserDto;
import com.rubach.lesson_journal_server.appuser.model.AppUser;
import com.rubach.lesson_journal_server.appuser.service.AppUserService;
import com.rubach.lesson_journal_server.common.endpoins.Endpoints;
import lombok.RequiredArgsConstructor;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Endpoints.USER)
@RequiredArgsConstructor
public class AppUserController {

    private final AppUserService appUserService;

    @GetMapping
    public Page<AppUserDto> getUsers(
            @And({
                    @Spec(params = "id", path = "id", spec = Equal.class),
                    @Spec(params = "firstName", path = "firstName", spec = LikeIgnoreCase.class),
                    @Spec(params = "lastName", path = "lastName", spec = LikeIgnoreCase.class),
                    @Spec(params = "secondName", path = "secondName", spec = LikeIgnoreCase.class),
                    @Spec(params = "personalIdNumber", path = "personalIdNumber", spec = LikeIgnoreCase.class),
                    @Spec(params = "phoneNumber", path = "phoneNumber", spec = LikeIgnoreCase.class),
                    @Spec(params = "address.city", path = "city", spec = LikeIgnoreCase.class),
                    @Spec(params = "address.streetName", path = "streetName", spec = LikeIgnoreCase.class),
                    @Spec(params = "address.buildingNumber", path = "buildingNumber", spec = LikeIgnoreCase.class),
                    @Spec(params = "apartamentNumber", path = "apartamentNumber", spec = LikeIgnoreCase.class),
                    @Spec(params = "userRole", path = "userRole", spec = Equal.class)
            })
                    Specification<AppUser> specification, Pageable pageable) {
        return appUserService.getAppUsers(specification, pageable);
    }

    @PostMapping
    public AppUserDto createAppUser(@RequestBody AppUserDto appUserDto) {
        return appUserService.createAppUser(appUserDto);
    }
}
