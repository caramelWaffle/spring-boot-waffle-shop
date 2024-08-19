package com.caramel.waffleshop.service;

import com.caramel.waffleshop.entity.UserEntity;
import com.caramel.waffleshop.models.UserData;
import com.caramel.waffleshop.repository.ShopRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ShopServiceImpl implements ShopService {

    private ShopRepository shopRepository;

    @Override
    public void createUser(UserData userData) {
        Optional<UserEntity> existUser = shopRepository.findByMobileNumber(userData.getMobileNumber());
        if (existUser.isPresent()) {
            throw new RuntimeException("customer already exist");
        }
        UserEntity newUser = new UserEntity();
        newUser.setFirstName(userData.getFirstName());
        newUser.setLastName(userData.getLastName());
        newUser.setEmail(userData.getEmail());
        newUser.setMobileNumber(userData.getMobileNumber());
        shopRepository.save(newUser);
    }
}
