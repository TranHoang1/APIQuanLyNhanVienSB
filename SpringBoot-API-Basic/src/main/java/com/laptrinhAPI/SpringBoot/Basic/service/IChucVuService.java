package com.laptrinhAPI.SpringBoot.Basic.service;

import org.springframework.stereotype.Service;

import com.laptrinhAPI.SpringBoot.Basic.dto.ChucVuDTO;

@Service
public interface IChucVuService {
	ChucVuDTO findOneCV(String tenCV);

	ChucVuDTO saveDTO(ChucVuDTO chucVuDTO);
}
