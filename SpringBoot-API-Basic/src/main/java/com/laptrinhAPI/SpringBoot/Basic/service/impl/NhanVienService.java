package com.laptrinhAPI.SpringBoot.Basic.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhAPI.SpringBoot.Basic.converter.ConvertNhanVien;
import com.laptrinhAPI.SpringBoot.Basic.converter.ConvertPhongBan;
import com.laptrinhAPI.SpringBoot.Basic.dto.NhanVienDTO;
import com.laptrinhAPI.SpringBoot.Basic.dto.PhongBanDTO;
import com.laptrinhAPI.SpringBoot.Basic.entity.NhanVienEntity;
import com.laptrinhAPI.SpringBoot.Basic.repository.NhanVienRepository;
import com.laptrinhAPI.SpringBoot.Basic.repository.PhongBanRepository;
import com.laptrinhAPI.SpringBoot.Basic.service.INhanVienService;

@Service
public class NhanVienService implements INhanVienService {
	@Autowired
	private PhongBanRepository phongBanRepository;

	@Autowired
	private NhanVienRepository nhanVienRepository;

	@Autowired
	private ConvertPhongBan convertPhongBan;
	@Autowired
	private ConvertNhanVien convertNV;

	/*
	 * public List<NhanVienDTO> listNV(PhongBanDTO dto) { PhongBanEntity entity =
	 * phongBanRepository.findOne(dto.getId()); List<NhanVienEntity> nhanViens =
	 * nhanVienRepository.findAll(); for (NhanVienEntity nhanVienEntity :
	 * nhanVienRepository.findAll()) { if (nhanVienEntity.getPhongban().getId() ==
	 * entity.getId()) { entity.getNhanVienPB().add(nhanVienEntity); } } return
	 * convertPhongBan.toDTO(entity).getNhanVienPB(); }
	 */
	public List<NhanVienDTO> listAll() {
		List<NhanVienEntity> entitis = new ArrayList<NhanVienEntity>();
		entitis = nhanVienRepository.findAll();
		List<NhanVienDTO> dtos = new ArrayList<NhanVienDTO>();
		for (NhanVienEntity entity : nhanVienRepository.findAll()) {
			dtos.add(convertNV.toDto(entity));
		}
		return dtos;
	}

	@Override
	public List<NhanVienDTO> listNV(PhongBanDTO dto) {
		List<NhanVienDTO> dtos = new ArrayList<>();
		List<NhanVienEntity> entitis = nhanVienRepository.findByphongban(convertPhongBan.toEntity(dto));
		for (NhanVienEntity nhanVienEntity : entitis) {
			dtos.add(convertNV.toDto(nhanVienEntity));
		}
		return dtos;
	}

	@Override
	public NhanVienDTO fineOne(String ten) {
		NhanVienEntity nvEntity = nhanVienRepository.findOneByHoTen(ten);
		return convertNV.toDto(nvEntity);
	}
}
