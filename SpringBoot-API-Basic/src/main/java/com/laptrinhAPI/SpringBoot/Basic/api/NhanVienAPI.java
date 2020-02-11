package com.laptrinhAPI.SpringBoot.Basic.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhAPI.SpringBoot.Basic.dto.NhanVienDTO;
import com.laptrinhAPI.SpringBoot.Basic.dto.PhongBanDTO;
import com.laptrinhAPI.SpringBoot.Basic.entity.NhanVienEntity;
import com.laptrinhAPI.SpringBoot.Basic.service.INhanVienService;

@RestController
public class NhanVienAPI {

	@Autowired
	private INhanVienService nhanVienService;

	@GetMapping(name = "/nhanvien")
	public NhanVienDTO dtos(@RequestBody NhanVienDTO model) {
		NhanVienDTO dto = nhanVienService.fineOne(model.getHoTen());
		return dto;
	}

	@PutMapping(value = "/nhanvien/{id}")
	public List<NhanVienDTO> dtos(@RequestBody PhongBanDTO model, @PathVariable("id") Long id) {
		model.setId(id);
		return nhanVienService.listNV(model);
	}

}
