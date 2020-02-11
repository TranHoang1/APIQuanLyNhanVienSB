package com.laptrinhAPI.SpringBoot.Basic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhAPI.SpringBoot.Basic.converter.ConvertPhongBan;
import com.laptrinhAPI.SpringBoot.Basic.dto.NhanVienDTO;
import com.laptrinhAPI.SpringBoot.Basic.dto.PhongBanDTO;
import com.laptrinhAPI.SpringBoot.Basic.entity.PhongBanEntity;
import com.laptrinhAPI.SpringBoot.Basic.repository.PhongBanRepository;
import com.laptrinhAPI.SpringBoot.Basic.service.IPhongBanService;

@Service
public class PhongBanService implements IPhongBanService {

	@Autowired
	private PhongBanRepository phongBanRepository;
	@Autowired
	private ConvertPhongBan convertPhongBan;

	@Override
	public List<NhanVienDTO> dtos(long id) {
//		return convertPhongBan.toDTO(phongBanRepository.findOne(id)).getNhanVienPB();
		PhongBanEntity entity = phongBanRepository.findOne(id);
		PhongBanDTO dto = convertPhongBan.toDTO(entity);

		return dto.getNhanVienPB();
	}

}
