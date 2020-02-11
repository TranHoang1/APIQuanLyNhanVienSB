 package com.laptrinhAPI.SpringBoot.Basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhAPI.SpringBoot.Basic.entity.PhongBanEntity;

public interface PhongBanRepository extends JpaRepository<PhongBanEntity, Long> {

}
