package com.laptrinhAPI.SpringBoot.Basic.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.laptrinhAPI.SpringBoot.Basic.dto.NhanVienDTO;
import com.laptrinhAPI.SpringBoot.Basic.entity.PhongBanEntity;

@Service
public interface IPhongBanService {
	List<NhanVienDTO> dtos(long id);
}
