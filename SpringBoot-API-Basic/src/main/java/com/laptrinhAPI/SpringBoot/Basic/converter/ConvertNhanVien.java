package com.laptrinhAPI.SpringBoot.Basic.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.laptrinhAPI.SpringBoot.Basic.dto.NhanVienDTO;
import com.laptrinhAPI.SpringBoot.Basic.entity.NhanVienEntity;

@Component
public class ConvertNhanVien {
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public NhanVienDTO toDto(NhanVienEntity entity) {
		return modelMapper().map(entity, NhanVienDTO.class);
	}
}
