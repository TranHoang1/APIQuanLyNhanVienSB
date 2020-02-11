package com.laptrinhAPI.SpringBoot.Basic.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.laptrinhAPI.SpringBoot.Basic.dto.ChucVuDTO;
import com.laptrinhAPI.SpringBoot.Basic.entity.ChucVuEntity;

@Component
public class ConvertWithModelMapper {

	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public ChucVuEntity toEntity(ChucVuDTO chucVuDTO) {
		return modelMapper().map(chucVuDTO, ChucVuEntity.class);
	}

	public ChucVuDTO toDTO(ChucVuEntity chucVuEntity) {
		return modelMapper().map(chucVuEntity, ChucVuDTO.class);
	}

	public ChucVuEntity toNewEntity(ChucVuEntity entity, ChucVuDTO dto) {
		entity.setTenCV(dto.getTenCV());
		entity.setCreatedDate(dto.getCreatedDate());
		entity.setCreatedBy(dto.getCreatedBy());
		entity.setModifiedBy(dto.getModifiedBy());
		entity.setModifiedDate(dto.getModifiedDate());

		return entity;
	}

}
