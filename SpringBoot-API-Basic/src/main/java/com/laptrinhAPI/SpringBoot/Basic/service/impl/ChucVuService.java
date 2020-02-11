package com.laptrinhAPI.SpringBoot.Basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhAPI.SpringBoot.Basic.converter.ConvertWithModelMapper;
import com.laptrinhAPI.SpringBoot.Basic.dto.ChucVuDTO;
import com.laptrinhAPI.SpringBoot.Basic.entity.ChucVuEntity;
import com.laptrinhAPI.SpringBoot.Basic.repository.ChucVuRepository;
import com.laptrinhAPI.SpringBoot.Basic.service.IChucVuService;

@Service
public class ChucVuService implements IChucVuService {

	@Autowired
	private ChucVuRepository chucVuRepository;

	@Autowired
	private ConvertWithModelMapper converter;

	@Override
	public ChucVuDTO findOneCV(String tenCV) {
		ChucVuEntity cvEntity = chucVuRepository.findOneByTenCV(tenCV);
		return converter.toDTO(cvEntity);
	}

	@Override
	public ChucVuDTO saveDTO(ChucVuDTO chucVuDTO) {
		ChucVuEntity entity = new ChucVuEntity();
		if (chucVuDTO.getId() != null) {
			ChucVuEntity oldEntity = chucVuRepository.findOne(chucVuDTO.getId());
			entity = converter.toNewEntity(oldEntity, chucVuDTO);
		} else {
			entity = converter.toEntity(chucVuDTO);
		}
		entity = chucVuRepository.save(entity);
		return converter.toDTO(entity);
	}

}
