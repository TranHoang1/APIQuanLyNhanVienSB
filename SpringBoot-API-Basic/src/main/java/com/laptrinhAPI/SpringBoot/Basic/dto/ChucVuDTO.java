package com.laptrinhAPI.SpringBoot.Basic.dto;

import java.util.ArrayList;
import java.util.List;

public class ChucVuDTO extends BaseDTO {

	private String tenCV;

	private List<NhanVienDTO> nhanvienCv = new ArrayList<>();

	public List<NhanVienDTO> getNhanvienCv() {
		return nhanvienCv;
	}

	public void setNhanvienCv(List<NhanVienDTO> nhanvienCv) {
		this.nhanvienCv = nhanvienCv;
	}

	public String getTenCV() {
		return tenCV;
	}

	public void setTenCV(String tenCV) {
		this.tenCV = tenCV;
	}

}
