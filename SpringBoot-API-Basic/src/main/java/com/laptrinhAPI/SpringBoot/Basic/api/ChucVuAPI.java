package com.laptrinhAPI.SpringBoot.Basic.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhAPI.SpringBoot.Basic.dto.ChucVuDTO;
import com.laptrinhAPI.SpringBoot.Basic.service.IChucVuService;

@RestController
public class ChucVuAPI {

	@Autowired
	private IChucVuService chucVuService;

	@GetMapping(value = "/chucvu")
	public ChucVuDTO findChucVu(@RequestBody ChucVuDTO model) {

		return chucVuService.findOneCV(model.getTenCV());
	}

	@PostMapping(value = "/chucvu")
	public ChucVuDTO createCV(@RequestBody ChucVuDTO model) {
		return chucVuService.saveDTO(model);
	}

	@PutMapping(value = "/chucvu/{id}")
	public ChucVuDTO updateCV(@RequestBody ChucVuDTO model, @PathVariable("id") Long id) {
		model.setId(id);
		return chucVuService.saveDTO(model);
	}
}
