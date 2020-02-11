package com.laptrinhAPI.SpringBoot.Basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhAPI.SpringBoot.Basic.entity.ChucVuEntity;

public interface ChucVuRepository extends JpaRepository<ChucVuEntity, Long> {
	ChucVuEntity findOneByTenCV(String tenCV);
}
