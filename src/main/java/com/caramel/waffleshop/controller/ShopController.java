package com.caramel.waffleshop.controller;

import com.caramel.waffleshop.models.UserData;
import com.caramel.waffleshop.service.ShopService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/user", produces = {MediaType.APPLICATION_JSON_VALUE})
@Validated
public class ShopController {

    @Autowired
    private ShopService service;

    @PostMapping("/create")
    public String createUser(@Valid @RequestBody UserData userData) {
        service.createUser(userData);
        return userData.toString();
    }
}