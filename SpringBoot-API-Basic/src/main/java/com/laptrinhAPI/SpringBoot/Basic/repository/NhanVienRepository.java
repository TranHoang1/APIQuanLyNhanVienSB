package com.laptrinhAPI.SpringBoot.Basic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhAPI.SpringBoot.Basic.entity.NhanVienEntity;
import com.laptrinhAPI.SpringBoot.Basic.entity.PhongBanEntity;

public interface NhanVienRepository extends JpaRepository<NhanVienEntity, Long> {
	NhanVienEntity findOneByHoTen(String ten);

	List<NhanVienEntity> findByphongban(PhongBanEntity idPB);
}
