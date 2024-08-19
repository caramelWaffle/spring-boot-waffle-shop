package com.caramel.waffleshop.repository;

import com.caramel.waffleshop.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShopRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findById(Long id);

    Optional<UserEntity> findByMobileNumber(String mobileNumber);
}
