package com.caramel.waffleshop.service;

import com.caramel.waffleshop.models.UserData;
import com.caramel.waffleshop.repository.ShopRepository;

public interface ShopService {
    void createUser(UserData userData);
}