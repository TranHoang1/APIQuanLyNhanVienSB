package com.laptrinhAPI.SpringBoot.Basic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laptrinhAPI.SpringBoot.Basic.dto.NhanVienDTO;
import com.laptrinhAPI.SpringBoot.Basic.dto.PhongBanDTO;

@Service
public interface INhanVienService {
	List<NhanVienDTO> listNV(PhongBanDTO pDto);

	List<NhanVienDTO> listAll();

	NhanVienDTO fineOne(String tenNV);
}
