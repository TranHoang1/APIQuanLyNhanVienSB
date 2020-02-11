
package com.laptrinhAPI.SpringBoot.Basic.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhAPI.SpringBoot.Basic.dto.NhanVienDTO;
import com.laptrinhAPI.SpringBoot.Basic.dto.PhongBanDTO;
import com.laptrinhAPI.SpringBoot.Basic.service.INhanVienService;
import com.laptrinhAPI.SpringBoot.Basic.service.IPhongBanService;

@RestController
public class PhongBanAPI {
	@Autowired
	private IPhongBanService iPhongBanService;

	@PutMapping("/phongban/{id}")
	public List<NhanVienDTO> nVOfpB(@RequestBody PhongBanDTO model, @PathVariable("id") Long id) {
		model.setId(id);
		return iPhongBanService.dtos(model.getId());
	}

}
