package com.laptrinhAPI.SpringBoot.Basic.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.laptrinhAPI.SpringBoot.Basic.dto.PhongBanDTO;
import com.laptrinhAPI.SpringBoot.Basic.entity.PhongBanEntity;

@Component
public class ConvertPhongBan {
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public PhongBanEntity toEntity(PhongBanDTO dto) {
		return modelMapper().map(dto, PhongBanEntity.class);
	}

	public PhongBanDTO toDTO(PhongBanEntity entity) {
		return modelMapper().map(entity, PhongBanDTO.class);
	}
}
